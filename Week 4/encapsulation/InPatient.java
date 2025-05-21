package com.bridgelabz.encapsulation;

import java.util.ArrayList;

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    private ArrayList<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double calculateBill() {
        double bill = daysAdmitted * dailyCharge;
        System.out.println("In-Patient Bill: " + bill);
        return bill;
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
