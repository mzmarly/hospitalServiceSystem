/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.ServiceImpl;

import com.agh.hospitalServiceSystem.Dao.VisitDao;
import com.agh.hospitalServiceSystem.Model.Visit;
import com.agh.hospitalServiceSystem.Service.VisitService;
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
public class VisitServiceImpl implements VisitService{

    @Autowired
    private VisitDao visitDao;
    
    @Override
    public Long create(Visit visit) {
        return visitDao.create(visit);
    }

    @Override
    public void update(Visit visit) {
        visitDao.update(visit);
    }

    @Override
    public Visit getVisitById(Long id) {
        return visitDao.getVisitById(id);
    }

    @Override
    public List<Visit> getVisits() {
        return visitDao.getVisits();
    }

    @Override
    public void removeVisit(Long id) {
        visitDao.removeVisit(id);
    }
    
    
}
