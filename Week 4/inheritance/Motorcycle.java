package com.bridgelabz.inheritance;

class Motorcycle extends Vehicle {
    private float mileage;

    public Motorcycle(float maxSpeed, String fuelType, float mileage) {
        super(maxSpeed, fuelType);
        this.mileage = mileage;
    }

    public void displayInfo() {
        System.out.println("\nMotorcycle Details:");
        super.displayInfo();
        System.out.println("Mileage is: " + mileage);
    }
}
