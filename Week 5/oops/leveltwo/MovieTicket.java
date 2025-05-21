package com.bridgelabz.oops.leveltwo;

class MovieTicket {
    String movieName;
    String seatNumber;
    float price;

    void bookTicket(String seatNumber, float price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void display() {
        System.out.println("The movie name is : " + movieName);
        System.out.println("The seat number is : " + seatNumber);
        System.out.println("The price is : " + price);
    }
}
