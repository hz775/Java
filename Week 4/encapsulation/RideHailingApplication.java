package com.bridgelabz.encapsulation;
import java.util.ArrayList;
import java.util.List;

public class RideHailingApplication {
    public static void main(String[] args) {
        List<VehicleDetails> vehicles = new ArrayList<>();
        vehicles.add(new CarDetails("C123", "Ravi", 10, "Koyambedu"));
        vehicles.add(new BikeDetails("B456", "Kiran", 5, "ECR"));
        vehicles.add(new Auto("A789", "Suresh", 7, "Poonamalle"));

        double distance = 12;

        for (VehicleDetails vehicle : vehicles) {
            vehicle.getVehicleDetails();
            vehicle.calculateFare(distance);
            GPS gpsVehicle = (GPS) vehicle;
            System.out.println("Current Location: " + gpsVehicle.getCurrentLocation());
            gpsVehicle.updateLocation();
        }
    }
}

