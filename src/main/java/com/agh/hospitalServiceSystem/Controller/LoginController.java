/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.Controller;

import com.agh.hospitalServiceSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    
    
}
