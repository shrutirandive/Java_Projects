/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Patient {
    String name;
    int age;
    String gender;
    String address;
    String city;
    
    static public List<Patient> patientDirectory= new ArrayList<Patient>();
    
//    private VitalSigns vitalsigns;
    
    public Patient() {
    }
    
    public Patient(String name, int age, String gender, String address, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", city=" + city + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static List<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public static void setPatientDirectory(List<Patient> patientDirectory) {
        Patient.patientDirectory = patientDirectory;
    }
    
    
    public void  addNewPatients(String name, int age, String gender, String address, String city) 
    {
//        vitalsigns = new VitalSigns();
//        List<VitalSigns> vitalsignsList = vitalsigns.getList();
        
        patientDirectory.add(new Patient(name, age, gender, address, city));
        System.out.println("Patient Added Successfully !!");
    }
    
}
