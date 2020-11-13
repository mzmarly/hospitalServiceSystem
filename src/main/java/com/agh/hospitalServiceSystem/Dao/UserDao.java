/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.Dao;

import com.agh.hospitalServiceSystem.Model.User;
import java.util.List;

/**
 *
 * @author Wiktor
 * @author Michal
 */
public interface UserDao {

    Long create(User user);

    void update(User user);

    User getUserById(Long id);

    List<User> getUsers();

    void removeUser(Long id);
}
