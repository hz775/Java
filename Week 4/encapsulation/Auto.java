package com.bridgelabz.encapsulation;

class Auto extends VehicleDetails implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = location;
    }

    public double calculateFare(double distance) {
        double fare = distance * ratePerKm;
        System.out.println("Auto Fare: " + fare);
        return fare;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation() {
        currentLocation = "Guindy";
        System.out.println("Updated Location: " + currentLocation);
    }
}
