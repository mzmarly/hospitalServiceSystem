/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.DaoImpl;

import com.agh.hospitalServiceSystem.Dao.VisitDao;
import com.agh.hospitalServiceSystem.Model.Diagnosis;
import com.agh.hospitalServiceSystem.Model.Status;
import com.agh.hospitalServiceSystem.Model.Visit;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Wiktor
 */
@Repository
public class VisitDaoImpl implements VisitDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Long create(Visit visit) {
        entityManager.persist(visit);
        entityManager.flush();
        return visit.getId();
    }

    @Override
    public void update(Visit visit) {
        entityManager.merge(visit);
    }

    @Override
    public Visit getVisitById(Long id) {
        return entityManager.find(Visit.class, id);
    }

    @Override
    public List<Visit> getVisits() {
        List<Visit> visit=new ArrayList();
        CriteriaBuilder cb=entityManager.getCriteriaBuilder();
        CriteriaQuery<Visit> cq=cb.createQuery(Visit.class);
        Root<Visit> rootEntry=cq.from(Visit.class);
        CriteriaQuery<Visit> all=cq.select(rootEntry);

        TypedQuery<Visit> allQuery=entityManager.createQuery(all);
        visit.addAll(allQuery.getResultList());

        return visit;
    }

    @Override
    public void removeVisit(Long id) {
        Visit v=getVisitById(id);
        if(v!=null){
            entityManager.remove(v);
        }
    }

    @Override
    public  void getReservation(Long id,Long id_patient) {

        Visit h = entityManager.find(Visit.class,  id);
        h.setStatus(Status.RESERVED);
        h.setPatient(id_patient);
        System.out.println(h.getId());
    }

    @Override
    public void afterVisit(Diagnosis diagnosis, long id) {

    }

//    @Override
//    public void afterVisit(Diagnosis diagnosis, long id) {
//        Visit h = entityManager.find(Visit.class, id);
//        h.setStatus(Status.DONE);
//        diagnosis.setVisit_id(id);
//    }
    }


