package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Hospital class, it stores doctor details in specific hospital
class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
    }

    //To add doctors in the hospital
    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    //Display which doctors working in the hospital
    void displayDoctorsInHospital() {
        System.out.println("Doctors in " + hospitalName + " are:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getDoctorName() + " - " + doctor.getSpecialization());
        }
    }
}
