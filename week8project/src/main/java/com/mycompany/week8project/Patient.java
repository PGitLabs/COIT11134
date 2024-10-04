/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8project;

/**
 *
 * @author psaga
 */
public class Patient {
    private int patientID;
    private String patientName;
    
    public Patient(int patientID, String patientName) {
        this.patientID = patientID;
        this.patientName = patientName;
    }
    
    public int retrievePatientID() {
        return patientID;
    }
    
    public void setPatientID(int patientID){
        this.patientID = patientID;
    }
    
    public String retrievePatientName() {
        return patientName;
    }
    
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
   
    
    
    @Override
    public String toString() {
        return ("PatientID: " + this.retrievePatientID() + "\tPatient Name: " + this.retrievePatientName()+"\n");
    }
}
