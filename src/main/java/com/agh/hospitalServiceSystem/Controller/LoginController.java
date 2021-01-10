/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.Controller;

import com.agh.hospitalServiceSystem.Model.User;
import com.agh.hospitalServiceSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Wiktor
 */
@Controller
public class LoginController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping({"/","/login"})
    public String loginPage(Model model){
        return "loginPage";
    }
    
    @PostMapping("/login")
    public String loginPage(Model model,String email,String password){
        User user=null;
        user=userService.authenticateUser(email, password);
        if(user!=null){
            model.addAttribute("user", user);
            return "home";
        }else{
            model.addAttribute("message","wrong crudentials");
            return "loginPage";
        }
    }
    
    @GetMapping("/logout")
    public String logout(Model model){
        return "loginPage";
    }
    
    
    
}
