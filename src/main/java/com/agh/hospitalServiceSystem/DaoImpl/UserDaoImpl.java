/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.DaoImpl;

import com.agh.hospitalServiceSystem.Dao.UserDao;
import com.agh.hospitalServiceSystem.Model.User;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Wiktor
 */
@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public Long create(User user) {
        entityManager.persist(user);
        entityManager.flush();
        return user.getId();
    }

    @Override
    public void update(User user) {
       entityManager.merge(user);
    }

    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public List<User> getUsers() {
        List<User> users=new ArrayList();
        CriteriaBuilder cb=entityManager.getCriteriaBuilder();
        CriteriaQuery<User> cq=cb.createQuery(User.class);
        Root<User> rootEntry=cq.from(User.class);
        CriteriaQuery<User> all=cq.select(rootEntry);
        
        TypedQuery<User> allQuery=entityManager.createQuery(all);
        users.addAll(allQuery.getResultList());
        
        return users;
    }
    
    
}
