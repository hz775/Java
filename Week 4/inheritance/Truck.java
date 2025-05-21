package com.bridgelabz.inheritance;

class Truck extends Vehicle {
    private float tankCapacity;

    public Truck(float maxSpeed, String fuelType, float tankCapacity) {
        super(maxSpeed, fuelType);
        this.tankCapacity = tankCapacity;
    }

    public void displayInfo() {
        System.out.println("\nTruck Details:");
        super.displayInfo();
        System.out.println("Tank Capacity is: " + tankCapacity);
    }
}
