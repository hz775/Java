package com.bridgelabz.encapsulation;

abstract class VehicleDetails {
    protected String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public VehicleDetails(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("\nVehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    public String getDriverName() {
        return driverName;
    }

    abstract double calculateFare(double distance);
}
