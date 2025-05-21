package com.bridgelabz.inheritance;

class ElectricVehicle extends VehicleDetails {
    private float chargingCapacity;

    public ElectricVehicle(float maxSpeed, String model, float chargingCapacity) {
        super(maxSpeed, model);
        this.chargingCapacity = chargingCapacity;
    }

    public void charge() {
        System.out.println("Charging Capacity: " + chargingCapacity);
        System.out.println("Charging");
    }
}
