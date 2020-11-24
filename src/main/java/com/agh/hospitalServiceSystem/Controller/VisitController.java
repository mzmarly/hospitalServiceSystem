/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.Controller;


import com.agh.hospitalServiceSystem.Model.Status;
import com.agh.hospitalServiceSystem.Model.User;
import com.agh.hospitalServiceSystem.Model.Diagnosis;
import com.agh.hospitalServiceSystem.Model.UserType;
import com.agh.hospitalServiceSystem.Model.Visit;

import java.awt.*;
import java.util.List;

import com.agh.hospitalServiceSystem.Service.DiagnosisService;
import com.agh.hospitalServiceSystem.ServiceImpl.DiagnosisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.agh.hospitalServiceSystem.Service.UserService;
import com.agh.hospitalServiceSystem.Service.VisitService;
import org.springframework.stereotype.Controller;

/**
 * @author Wiktor
 */
@Controller
public class VisitController {
    @Autowired
    private VisitService visitService;
    @Autowired
    private DiagnosisService diagnosisService;


    @PostMapping("/addVisits")
    public Long addVisit(@RequestBody Visit visit) {
        return visitService.create(visit);
    }

    @GetMapping("/visits/{id}")
    public String getPatientVisits(@PathVariable(value = "id") long id,Model model) {
        model.addAttribute("listofvisits",visitService.getVisitByPatientId(id));
        return "visits";
    }

    @PatchMapping("/updateVisit")
    public void uptadeVisit(@RequestParam Visit visit) {
        visitService.update(visit);
    }

    @DeleteMapping("/removeVisit")
    public void removeVisit(@PathVariable(value = "id") long id) {
        visitService.removeVisit(id);
    }

    @PatchMapping("/getReservation/{id}/{patient_id}")
    public void getReservation(@PathVariable long id, @PathVariable long patient_id) {
        visitService.getReservation(id, patient_id);
    }

    @PostMapping("/afterVisit/{id}")
    public void afterVisit(@RequestBody Diagnosis diagnosis, @PathVariable long id) {
        diagnosisService.create(diagnosis);
        visitService.afterVisit(diagnosis, id);
    }

    @GetMapping("/visits")
    public String getVisits(Model model){
        model.addAttribute("listofvisits", visitService.getAvaiable());
        return "visits";
    }

    @GetMapping("/home")
    public String homePage(Model model){
        return "home";
    }
    
    @GetMapping("/doctor/{doctorId}/setvisit")
    public String setVisit(@PathVariable long doctorId,Model model){
        model.addAttribute("listofvisits", visitService.getAvaiable());
        return "setVisit";
    }


}