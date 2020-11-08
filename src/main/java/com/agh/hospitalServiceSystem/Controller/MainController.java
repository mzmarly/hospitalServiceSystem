/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.Controller;


import com.agh.hospitalServiceSystem.Model.User;
import com.agh.hospitalServiceSystem.Model.Visit;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agh.hospitalServiceSystem.Service.UserService;
import com.agh.hospitalServiceSystem.Service.VisitService;


/**
 *
 * @author Wiktor
 */
@RestController
public class MainController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private VisitService visitService;
    
    
    @GetMapping("/visits")
    public List<Visit> getAll(){
        return visitService.getVisits();
    }
    
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }
    
}
