package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//patient class
class Patient {
    String patientName;
    String disease;
    ArrayList<Doctor> doctors;

    Patient(String patientName, String disease) {
        this.patientName = patientName;
        this.disease = disease;
        doctors = new ArrayList<>();
    }

    //To assign patient to a doctor
    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    String getPatientName() {
        return patientName;
    }

    String getDisease() {
        return disease;
    }

    //Display doctors who are assigned to the patient
    void displayDoctors() {
        System.out.println("\nDoctors assigned to " + patientName + " are:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getDoctorName());
        }
    }
}
