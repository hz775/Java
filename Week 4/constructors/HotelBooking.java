package com.bridgelabz.constructors;

class HotelBooking {
    String guestName;
    String roomType;
    int numberOfNights;

    HotelBooking() {
        guestName = "Jack";
        roomType = "Double";
        numberOfNights = 3;
    }

    HotelBooking(String stringName, String roomType, int numberOfNights) {
        this.guestName = stringName;
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
    }

    HotelBooking(HotelBooking hotelBooking) {
        this.guestName = hotelBooking.guestName;
        this.roomType = hotelBooking.roomType;
        this.numberOfNights = hotelBooking.numberOfNights;
    }

    public void display() {
        System.out.println("The guest name is: " + guestName);
        System.out.println("The room type is: " + roomType);
        System.out.println("The number of nights is: " + numberOfNights);
    }
}
