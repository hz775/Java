package com.bridgelabz.objectModelling;

public class LibraryAndBooks {
    public static void main(String[] args) {
        Library libraryOne=new Library("Vidyanikethan");//library one
        Library libraryTwo=new Library("Viswesarathna");//library two

        //Creating a book object
        Book bookOne=new Book("Sherlock Holmes", "Walter White");
        Book bookTwo=new Book("The Hobbit", "JRR Tolkien");
        Book bookThree=new Book("The Hitchhiker's Guide to the Galaxy", "Henry Mitchel");

        //Add books in different library
        libraryOne.addBook(bookOne);
        libraryOne.addBook(bookTwo);
        libraryTwo.addBook(bookThree);
        libraryTwo.addBook(bookOne);
        System.out.println("The list of books in the library 1 is: ");
        libraryOne.displayBooks();
        System.out.println("\nThe list of books in the library 2 is: ");
        libraryTwo.displayBooks();
    }
}