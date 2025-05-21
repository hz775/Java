package com.bridgelabz.inheritance;

class Vehicle {
    private float maxSpeed;
    private String fuelType;

    public Vehicle(float maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max speed is: " + maxSpeed);
        System.out.println("Fuel type is: " + fuelType);
    }
}
