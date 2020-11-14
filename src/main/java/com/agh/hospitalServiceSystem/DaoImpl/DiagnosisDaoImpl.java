package com.agh.hospitalServiceSystem.DaoImpl;

import com.agh.hospitalServiceSystem.Dao.DiagnosisDao;
import com.agh.hospitalServiceSystem.Dao.VisitDao;
import com.agh.hospitalServiceSystem.Model.Status;
import com.agh.hospitalServiceSystem.Model.Diagnosis;
import com.agh.hospitalServiceSystem.Model.User;
import com.agh.hospitalServiceSystem.Model.Visit;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public class DiagnosisDaoImpl implements DiagnosisDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    // public Long
    public void create(Diagnosis diagnosis) {
        entityManager.persist(diagnosis);
        entityManager.flush();
        //  return diagnosis.getId();
    }

    @Override
    public void update(Diagnosis diagnosis) {
        entityManager.merge(diagnosis);

    }

}
