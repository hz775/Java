package com.bridgelabz.encapsulation;

import java.util.ArrayList;

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private ArrayList<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        System.out.println("Out-Patient Bill: " + consultationFee);
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }
}
