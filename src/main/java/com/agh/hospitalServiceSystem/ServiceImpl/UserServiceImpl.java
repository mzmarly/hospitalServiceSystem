/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.ServiceImpl;

import com.agh.hospitalServiceSystem.Dao.UserDao;
import com.agh.hospitalServiceSystem.Model.User;
import com.agh.hospitalServiceSystem.Model.UserType;
import com.agh.hospitalServiceSystem.Service.UserService;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Wiktor
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public Long create(User user) {
        return userDao.create(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
    
    @Override
    public void removeUser(Long id){
        userDao.removeUser(id);
    }
    
    @Override
    public List<User> getPatients() {
        List<User> patients=new ArrayList<>();
        List<User> all=userDao.getUsers();
        for(User u:all){
            if(u.getUserType().equals(UserType.PATIENT)){
                patients.add(u);
            }
        }
        return patients;
    }
    
    @Override
    public List<User> getDoctors() {
        List<User> patients=new ArrayList<>();
        List<User> all=userDao.getUsers();
        for(User u:all){
            if(u.getUserType().equals(UserType.DOCTOR)){
                patients.add(u);
            }
        }
        return patients;
    }

    @Override
    public User authenticateUser(String email, String password) {
        User user=null;
        List<User>users=getUsers();
        for(User u:users){
            if(u.getEmail().contains(email) && u.getPassword().contains(password)){
                user=u;
            }
        }
        return user;
    }
    

}
