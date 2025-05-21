package com.bridgelabz.inheritance;

class Car extends Vehicle {
    private int seatCapacity;

    public Car(float maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo() {
        System.out.println("Car Details:");
        super.displayInfo();
        System.out.println("Seat Capacity is: " + seatCapacity);
    }
}
