package com.bridgelabz.constructors;

class Books {
    String title;
    String author;
    int price;

    Books() {
        title = "Sherlock Holmes";
        author = "Walter White";
        price = 100;
    }

    Books(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("The title of the book is " + title);
        System.out.println("The author of the book is " + author);
        System.out.println("The price of the book is " + price);
    }
}
