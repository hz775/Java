package com.bridgelabz.encapsulation;

import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("TN JK 3456", "Car", 1000));
        vehicles.add(new Bike("TN JK 3457", "Bike", 500));
        vehicles.add(new Truck("TN JK 3458", "Truck", 10000));

        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(3);
            double insurance = ((Insurable) vehicle).calculateInsurance();
            double totalCost = rentalCost + insurance;
            System.out.println("\nVehicle: " + vehicle.type);
            System.out.println("Rental cost: "+rentalCost);
            System.out.println("Insurance amount: "+insurance);
            System.out.println("Total cost: "+totalCost);
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
        }
    }
}
