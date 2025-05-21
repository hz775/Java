package com.bridgelabz.inheritance;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle=new ElectricVehicle(150, "BMW", 100);
        PetrolVehicle petrolVehicle=new PetrolVehicle(100, "Honda", 30);

        electricVehicle.displayDetails();
        electricVehicle.charge();

        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
    }
}
