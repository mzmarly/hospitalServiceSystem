/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.Controller;


import com.agh.hospitalServiceSystem.Model.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.agh.hospitalServiceSystem.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

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
    
    @GetMapping("/patients")
    public String getPatients(Model model){
        model.addAttribute("listofdoctors", userService.getPatients());
        return "patients";
    }
    
    @GetMapping("/doctors")
    public String getDoctors(Model model){
        model.addAttribute("listofdoctors", userService.getDoctors());
        return "doctors";
    }
    
    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable(value = "id") long id,Model model){
        User user=null;
        user=userService.getUserById(id);
        model.addAttribute("user", user);
        return "User";
    }
    
}