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
    String patientCity;
    int patientAge;

    public Appointment(String docName, String patientName, String patientCity, int patientAge) {
        this.docName = docName;
        this.patientName = patientName;
        this.patientCity = patientCity;
        this.patientAge = patientAge;
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

    public String getPatientCity() {
        return patientCity;
    }

    public void setPatientCity(String patientCity) {
        this.patientCity = patientCity;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public static List<Appointment> getEncounterHistory() {
        return encounterHistory;
    }

    public static void setEncounterHistory(List<Appointment> encounterHistory) {
        Appointment.encounterHistory = encounterHistory;
    }
    static public List<Appointment> encounterHistory= new ArrayList<Appointment>();
}
