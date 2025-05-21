package com.bridgelabz.inheritance;

class PetrolVehicle extends VehicleDetails implements Refuelable {
    private float tankCapacity;

    public PetrolVehicle(float maxSpeed, String model, float tankCapacity) {
        super(maxSpeed, model);
        this.tankCapacity = tankCapacity;
    }

    public void refuel() {
        System.out.println("Tank Capacity: " + tankCapacity);
        System.out.println("Refueling");
    }
}
