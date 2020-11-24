package com.agh.hospitalServiceSystem.Service;

import com.agh.hospitalServiceSystem.Model.Diagnosis;
import com.agh.hospitalServiceSystem.Model.User;

public interface DiagnosisService {
    void create(Diagnosis diagnosis);

    void update(Diagnosis diagnosis);

    Diagnosis showDiagnosisById(Long id);
}
