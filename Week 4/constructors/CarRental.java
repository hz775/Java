package com.bridgelabz.constructors;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    int pricePerDay;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        pricePerDay = 500;
    }

    public void display() {
        System.out.println("Customer name: " + customerName);
        System.out.println("Car model: " + carModel);
        System.out.println("Rental days: " + rentalDays);
        System.out.println("The price for the car for " + rentalDays + " is: " + (rentalDays * pricePerDay));
    }
}
