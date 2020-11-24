/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.Model;

import com.fasterxml.jackson.annotation.*;

import java.util.Date;
import javax.persistence.*;

import static javax.persistence.EnumType.STRING;

/**
 * @author Wiktor
 */

@Entity
@Table(name = "Visits")
public class Visit {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date dateOfVisit;

    @Enumerated(STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @JsonProperty("patient_id")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    private User patient;


    @ManyToOne
    @JoinColumn(name = "doctor_id")
    @JsonProperty("doctor_id")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    private User doctor;


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Column
    private String adress;

    public Visit() {
        this.dateOfVisit = null;
        this.patient = null;
        this.doctor = null;
        this.status = null;
        this.adress=null;
    }

    public Visit(Date dateOfVisit,Status status, User patient, User doctor,String adress) {
        this.dateOfVisit = dateOfVisit;
        this.patient = patient;
        this.doctor = doctor;
        this.status = status;
        this.adress=adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public User getPatient() {
        return patient;
    }
    @JsonProperty("patient_id")
    public void setPatient(long id) {
        this.patient = User.fromId(id);
    }

    public User getDoctor() {
        return doctor;
    }

    @JsonProperty("doctor_id")
    public void setDoctor(long id) {
        this.doctor = User.fromId(id);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
