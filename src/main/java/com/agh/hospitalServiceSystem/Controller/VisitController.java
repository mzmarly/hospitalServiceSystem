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
    @Autowired
    private UserService userService;

//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/addVisit/{doctor_id}")///{patient_id}
//    public Long addVisit(@RequestBody Visit visit) {
//
//        return visitService.create(visit);
//    }
    @PostMapping("/addVisits")
    public Long addVisit(@RequestBody Visit visit) {
        return visitService.create(visit);
    }

//    @GetMapping("/getVisits")
//    public List<Visit> getVisits() {
//        return visitService.getVisits();
//    }

    @GetMapping("/getVisit/{id}")
    public Visit getVisit(@PathVariable(value = "id") long id) {
        return visitService.getVisitById(id);
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
    public String nic(Model model){
        return "home";
    }


}