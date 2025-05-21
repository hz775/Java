package com.bridgelabz.encapsulation;

class Bike extends Vehicle implements Insurable {
    private int insuranceAmount = 100;

    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    double calculateRentalCost(int days) {
        return days * rentalRate;
    }

    public double calculateInsurance() {
        return rentalRate + insuranceAmount;
    }

    public String getInsuranceDetails() {
        return "Insurance company: ICICI\nInsurance Amount per day: " + insuranceAmount;
    }
}
