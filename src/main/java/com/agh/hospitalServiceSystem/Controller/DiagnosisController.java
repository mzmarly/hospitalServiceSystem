package com.agh.hospitalServiceSystem.Controller;


import com.agh.hospitalServiceSystem.Model.Diagnosis;
import com.agh.hospitalServiceSystem.Model.User;
import com.agh.hospitalServiceSystem.Service.DiagnosisService;
import com.agh.hospitalServiceSystem.Service.UserService;
import com.agh.hospitalServiceSystem.Service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
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


    @GetMapping("/diagnosis/{id}")
    public String showDiagnosisById(@PathVariable(value = "id") long id,Model model){
        model.addAttribute("diagnosis", diagnosisService.showDiagnosisById(id));
        return "diagnosis";
    }


}