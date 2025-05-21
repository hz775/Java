package com.bridgelabz.inheritance;

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle car=new Car(150, "Petrol", 4);
        Vehicle truck=new Truck(100, "Petrol", 60);
        Vehicle motorcycle=new Motorcycle(50, "Petrol", 50);
        car.displayInfo();
        truck.displayInfo();
        motorcycle.displayInfo();
    }
}
