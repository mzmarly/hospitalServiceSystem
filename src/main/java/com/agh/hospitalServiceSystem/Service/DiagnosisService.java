package com.agh.hospitalServiceSystem.Service;

import com.agh.hospitalServiceSystem.Model.Diagnosis;
import com.agh.hospitalServiceSystem.Model.User;

import java.util.List;

public interface DiagnosisService {
    void create(Diagnosis diagnosis);

    void update(Diagnosis diagnosis);

    Diagnosis showDiagnosisById(Long id);

    List<Diagnosis> getDiagnosisByUserId(Long id);
}
