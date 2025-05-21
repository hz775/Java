package com.bridgelabz.constructors;

class BookAvailability {
    String title;
    String author;
    int price;
    int availability = 10;

    BookAvailability(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void borrowBook(int requiredBooks) {
        if (availability > requiredBooks) {
            availability -= requiredBooks;
            System.out.println("The title of the book is " + title);
            System.out.println("The author of the book is " + author);
            System.out.println("The price of the book is " + price);
            System.out.println("The book is borrowed successfully.");
        } else {
            System.out.println("The book is not available.");
        }
    }
}
