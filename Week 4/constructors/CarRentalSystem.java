package com.bridgelabz.constructors;

import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the customer name: ");
        String customerName=scanner.nextLine();
        System.out.println("Enter the car model: ");
        String carModel=scanner.nextLine();
        System.out.println("Enter the rental days: ");
        int rentalDays=scanner.nextInt();
        CarRental carRental=new CarRental(customerName, carModel, rentalDays);
        carRental.display();
        scanner.close();
    }
}
