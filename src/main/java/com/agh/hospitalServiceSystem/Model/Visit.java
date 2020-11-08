/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agh.hospitalServiceSystem.Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Wiktor
 */

@Entity
@Table(name="Visits")
public class Visit{
        @Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
        
        @Column
        private Date dateOfVisit;
        
        @ManyToOne
        @JoinColumn(name="user_id",insertable=false, updatable=false)
        private User patient;
        
        @ManyToOne
        @JoinColumn(name="user_id",insertable=false, updatable=false)
        private User doctor;

      
    public Visit() {
        this.dateOfVisit = null;
        this.patient = null;
        this.doctor = null;
    }
    
    public Visit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
        this.patient = patient;
        this.doctor = doctor;
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

    public void setPatient(User patient) {
        this.patient = patient;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }
        
        
        
}
