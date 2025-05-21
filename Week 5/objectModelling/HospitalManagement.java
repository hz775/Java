package com.bridgelabz.objectModelling;

public class HospitalManagement {
    public static void main(String[] args) {
        //Creating hospital object
        Hospital hospitalOne=new Hospital("AIMS");
        //Creating doctor objects
        Doctor doctorOne=new Doctor("Manish", "General Medicine");
        Doctor doctorTwo=new Doctor("Kuladeep", "Dermatologist");
        //Creating patient objects
        Patient patientOne=new Patient("Ravi", "Cough");
        Patient patientTwo=new Patient("John", "Cold");
        Patient patientThree=new Patient("Henry", "Fever");
        Patient patientFour=new Patient("John", "Rashes");
        //Adding doctors to hospital
        hospitalOne.addDoctor(doctorOne);
        hospitalOne.addDoctor(doctorTwo);
        //Assigning patients to doctors
        doctorOne.addPatient(patientOne);
        doctorOne.addPatient(patientTwo);
        doctorTwo.addPatient(patientThree);
        doctorTwo.addPatient(patientFour);
        //Display which doctors are working in which hospital
        hospitalOne.displayDoctorsInHospital();
        //Showing doctors assigned to the patient
        patientOne.displayDoctors();
        patientTwo.displayDoctors();
        patientThree.displayDoctors();
        patientFour.displayDoctors();
        //Showing patients under the doctor
        doctorOne.displayPatients();
        doctorTwo.displayPatients();
    }
}