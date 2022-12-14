/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Appointment {
    String docName;
    String patientName;
    String patientCommunity;
    int patientAge;
    VitalSigns vs;

    public Appointment(String docName, String patientName, String patientCommunity, int patientAge, VitalSigns vs) {
        this.docName = docName;
        this.patientName = patientName;
        this.patientCommunity = patientCommunity;
        this.patientAge = patientAge;
        this.vs = vs;
    }
   

 
    static public List<Appointment> bookAppointment= new ArrayList<Appointment>();
    
    public Appointment(String docName, String patientName, String patientCommunity, int patientAge) {
        this.docName = docName;
        this.patientName = patientName;
        this.patientCommunity = patientCommunity;
        this.patientAge = patientAge;
    }

    @Override
    public String toString() {
        return patientName;
//        return "Appointment{" + "docName=" + docName + ", patientName=" + patientName + ", patientCity=" + patientCity + ", patientAge=" + patientAge + '}';
    }

    public Appointment() {
        }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientCommunity() {
        return patientCommunity;
    }

    public void setPatientCommunity(String patientCity) {
        this.patientCommunity = patientCommunity;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public static List<Appointment> getBookAppointment() {
        return bookAppointment;
    }

    public static void setBookAppointment(List<Appointment> bookAppointment) {
        Appointment.bookAppointment = bookAppointment;
    }
    
}
