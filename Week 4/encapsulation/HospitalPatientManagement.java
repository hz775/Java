package com.bridgelabz.encapsulation;

import java.util.*;

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient patientOne = new InPatient("P1001", "Ravi", 30, "Diabetes", 5, 200);
        Patient patientTwo = new OutPatient("P2001", "Kiran", 40, "Cold", 100);

        List<Patient> patients = new ArrayList<>();
        patients.add(patientOne);
        patients.add(patientTwo);

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Disease affected with: " + patient.getDisease());
            patient.calculateBill();
            ((MedicalRecord) patient).addRecord("Routine Checkup");
            ((MedicalRecord) patient).viewRecords();
        }
    }
}
