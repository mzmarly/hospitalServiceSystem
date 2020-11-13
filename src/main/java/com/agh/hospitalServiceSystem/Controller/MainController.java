/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.Controller;


import com.agh.hospitalServiceSystem.Model.Status;
import com.agh.hospitalServiceSystem.Model.User;
import com.agh.hospitalServiceSystem.Model.UserType;
import com.agh.hospitalServiceSystem.Model.Visit;

import java.awt.*;
import java.util.List;

//import com.agh.hospitalServiceSystem.Request.DateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.agh.hospitalServiceSystem.Service.UserService;
import com.agh.hospitalServiceSystem.Service.VisitService;


/**
 * @author Wiktor
 * @author Michal
 */
@RestController
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private VisitService visitService;


    @GetMapping("/visits")
    public List<Visit> getAll() {
        return visitService.getVisits();
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @PostMapping("/addUser")
    public Long addUeser(@RequestBody User user) {
        return userService.create(user);
    }
    @PatchMapping("/updateUser")
    public void uptadeUser(@RequestParam User user) {
        userService.update(user);
    }
    @DeleteMapping("/removeUser")
    public void removeUser(@PathVariable(value = "id") long id) {

        userService.removeUser(id);
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE, value = "/addVisit/{doctor_id}/{patient_id}")
    public Long addisit(@RequestBody Visit visit/*, @PathVariable(value = "doctor_id") long doctor_id, @PathVariable(value = "patient_id") long patient_id*/) {
//User u=new User("LALA","michalzma@gmail.com","michal", "1234", UserType.DOCTOR);
//        User doctor = userService.getUserById(doctor_id);
//        User patient = userService.getUserById(patient_id);
//        System.out.println();
//        System.out.println();
//        System.out.println(dateRequest.getDateOfVisit());
//        System.out.println(patient.getId());
//
//        Visit visit1 = new Visit();
//         visit1.setDateOfVisit(dateRequest.getDateOfVisit());
//       visit1.setDoctor(doctor);
//        visit1.setPatient(patient);
//
//        visit1.setStatus(dateRequest.getStatus());

        return visitService.create(visit);
    }

    @GetMapping("/getVisits")
    public List<Visit> getVisits() {
        return visitService.getVisits();
    }

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

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE, value = "/addVisit/{doctor_id}/{patient_id}")
    public void takePart(@RequestBody Visit visit/*, @PathVariable(value = "doctor_id") long doctor_id, @PathVariable(value = "patient_id") long patient_id*/) {
//User u=new User("LALA","michalzma@gmail.com","michal", "1234", UserType.DOCTOR);
//        User doctor = userService.getUserById(doctor_id);
//        User patient = userService.getUserById(patient_id);
//        System.out.println();
//        System.out.println();
//        System.out.println(dateRequest.getDateOfVisit());
//        System.out.println(patient.getId());
//
//        Visit visit1 = new Visit();
//         visit1.setDateOfVisit(dateRequest.getDateOfVisit());
//       visit1.setDoctor(doctor);
//        visit1.setPatient(patient);
//
//        visit1.setStatus(dateRequest.getStatus());

        visitService.update(visit);
    }
}