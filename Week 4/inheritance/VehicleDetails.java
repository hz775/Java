package com.bridgelabz.inheritance;

class VehicleDetails {
    private float maxSpeed;
    private String model;

    public VehicleDetails(float maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Model: " + model);
    }
}
