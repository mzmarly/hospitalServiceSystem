package com.agh.hospitalServiceSystem.Model;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import static javax.persistence.EnumType.STRING;



@Entity
@Table(name = "Diagnosis")
public class Diagnosis {
    @Id
    @Column(name = "diagnosis_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Diagnosis(Long id, String disease, String recommendations, int prescription, Long doctor) {
        this.id = id;
        this.disease = disease;
        this.recommendations = recommendations;
        this.prescription = prescription;
        this.doctor = doctor;
    }

    public Diagnosis() {
    }
    
    @Column
    private String disease;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public int getPrescription() {
        return prescription;
    }

    public void setPrescription(int prescription) {
        this.prescription = prescription;
    }

    public Long getDoctor() {
        return doctor;
    }

    public void setDoctor(Long doctor) {
        this.doctor = doctor;
    }

    @Column
    private String recommendations;

    @Column
    private int prescription;

    @Column
    private Long doctor;

    public Long getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(Long visit_id) {
        this.visit_id = visit_id;
    }

    @Column
    private Long visit_id;
}


