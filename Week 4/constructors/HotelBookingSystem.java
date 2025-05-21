package com.bridgelabz.constructors;

import java.util.Scanner;

public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the guestname: ");
        String guestName=scanner.nextLine();
        System.out.println("Enter the room type: ");
        String roomType=scanner.nextLine();
        System.out.println("Enter the number of nights: ");
        int numberOfNights=scanner.nextInt();

        HotelBooking hotelBookingDefault=new HotelBooking();
        HotelBooking hotelBookingParametrized=new HotelBooking(guestName, roomType, numberOfNights);
        HotelBooking hotelBookingCopy=new HotelBooking(hotelBookingParametrized);

        System.out.println("\nThe details using default constructor: ");
        hotelBookingDefault.display();
        System.out.println("\nThe details using parameterized constructor: ");
        hotelBookingParametrized.display();
        System.out.println("\nThe details using copy constructor: ");
        hotelBookingCopy.display();
        scanner.close();
    }
}