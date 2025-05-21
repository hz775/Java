package com.bridgelabz.encapsulation;

class CarDetails extends VehicleDetails implements GPS {
    private String currentLocation;

    public CarDetails(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = location;
    }

    public double calculateFare(double distance) {
        double fare = distance * ratePerKm;
        System.out.println("Car Fare: " + fare);
        return fare;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation() {
        currentLocation = "T Nagar";
        System.out.println("Updated Location: " + currentLocation);
    }
}
