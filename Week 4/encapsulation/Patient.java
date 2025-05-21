package com.bridgelabz.encapsulation;

abstract class Patient {
    protected String patientId;
    protected String name;
    protected int age;
    private String disease;

    public Patient(String patientId, String name, int age, String disease) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public void getPatientDetails() {
        System.out.println("\nPatient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getDisease() {
        return disease;
    }

    abstract double calculateBill();
}
