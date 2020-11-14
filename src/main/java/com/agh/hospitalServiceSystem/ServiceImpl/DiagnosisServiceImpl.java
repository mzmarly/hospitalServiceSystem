package com.agh.hospitalServiceSystem.ServiceImpl;


import com.agh.hospitalServiceSystem.Dao.DiagnosisDao;
import com.agh.hospitalServiceSystem.Dao.UserDao;
import com.agh.hospitalServiceSystem.Model.Diagnosis;
import com.agh.hospitalServiceSystem.Service.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DiagnosisServiceImpl implements DiagnosisService {

    @Autowired
    private DiagnosisDao diagnosisDao;

    @Override
    public void create(Diagnosis diagnosis) {
        //return
        diagnosisDao.create(diagnosis);
    }

    @Override
    public void update(Diagnosis diagnosis) {
        diagnosisDao.update(diagnosis);
    }
}
