package com.bridgelabz.constructors;

class Vehicle {
    String ownerName;
    String vehicleType;
    static int registrationFee = 5000;

    Vehicle(String OwnerName, String VehicleType) {
        this.ownerName = OwnerName;
        this.vehicleType = VehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner name is: " + ownerName);
        System.out.println("Vehicle type is: " + vehicleType);
        System.out.println("Registration fee is: " + registrationFee);
    }

    static void updateRegistrationFee(int registrationFee) {
        Vehicle.registrationFee = registrationFee;
    }
}
