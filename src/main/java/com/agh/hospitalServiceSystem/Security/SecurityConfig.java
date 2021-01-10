/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.Security;

import com.agh.hospitalServiceSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author Wiktor
 */
@Configuration
//@EnableWebSecurity
public class SecurityConfig{
    
    @Autowired
    private UserService userService;
    /*
    @Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/", "/home").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()
				.and()
			.logout()
				.permitAll()
                                .logoutUrl("/logout");
	}
        
        @Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
		authenticationMgr.inMemoryAuthentication().withUser("admin").password("admin").authorities("ROLE_USER").and()
				.withUser("wiktor").password("wanat").authorities("ROLE_USER", "ROLE_ADMIN");
        }

        */
}