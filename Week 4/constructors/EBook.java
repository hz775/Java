package com.bridgelabz.constructors;

class EBook extends Book {
    EBook(long ISBN, String title) {
        super(ISBN, title);
    }

    public void displayDetails() {
        System.out.println("\nISBN is accessed using super : " + super.ISBN);
        System.out.println("Title is accessed using super from parent class : " + super.title);
        System.out.println("Author is accessed using setters and getters: " + getAuthor());
    }
}
