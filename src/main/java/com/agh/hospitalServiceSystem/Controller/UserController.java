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
import org.springframework.ui.ModelMap;

@RestController
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
    public List<User> getPatients(){
        return userService.getPatients();
    }
    
    @GetMapping("/doctors")
    public List<User> getDoctors(ModelMap model){
       //String name = (String) model.get("name");
        //model.put("doctors", userService.getDoctors());
        return userService.getDoctors();
    }
    
}