package com.bridgelabz.constructors;

import java.util.Scanner;

public class VehicleRegistration {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the owner name: ");
        String OwnerName=scanner.nextLine();
        System.out.println("Enter the vehicle type: ");
        String VehicleType=scanner.nextLine();

        Vehicle vehicle=new Vehicle(OwnerName, VehicleType);
        vehicle.displayVehicleDetails();

        System.out.println("Enter the new registration fee to update : ");
        int registrationFee=scanner.nextInt();
        Vehicle.updateRegistrationFee(registrationFee);
        System.out.println("The details after updating registration fee: ");
        vehicle.displayVehicleDetails();
        scanner.close();
    }
}