package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Doctor class
class Doctor {
    String doctorName;
    String specialization;
    ArrayList<Patient> patients;

    Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        patients = new ArrayList<>();
    }

    //Assign patients to doctors
    void addPatient(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);

    }

    String getDoctorName() {
        return doctorName;
    }

    String getSpecialization() {
        return specialization;
    }

    //Show which patients are assigned to each doctor
    void displayPatients() {
        System.out.println("\nPatients under " + doctorName + " are:");
        for (Patient patient : patients) {
            System.out.println(patient.getPatientName() + " affected with " + patient.getDisease());
        }
    }
}
