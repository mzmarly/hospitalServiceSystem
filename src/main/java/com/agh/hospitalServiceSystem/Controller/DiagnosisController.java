package com.agh.hospitalServiceSystem.Controller;


import com.agh.hospitalServiceSystem.Model.Diagnosis;
import com.agh.hospitalServiceSystem.Model.User;
import com.agh.hospitalServiceSystem.Service.DiagnosisService;
import com.agh.hospitalServiceSystem.Service.UserService;
import com.agh.hospitalServiceSystem.Service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DiagnosisController {

    @Autowired
    private DiagnosisService diagnosisService;
    @Autowired
    private VisitService visitService;

    @PostMapping("/addDiagnosis")
    public void addDiagnosis(@RequestBody Diagnosis diagnosis) {
        //return
        diagnosisService.create(diagnosis);
    }

    @PatchMapping("/updateDiagnosis")
    public void uptadeDiagnosis(@RequestParam Diagnosis diagnosis) {
        diagnosisService.update(diagnosis);
    }


}