package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Library class, to store books in different libraries
class Library {
    private ArrayList<Book> books;
    String libraryName;

    Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    //To add books
    public void addBook(Book book) {
        books.add(book);
    }

    //To display books
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(libraryName + " library has book \"" + book.getTitle() + " by " + book.getAuthor() + "\"");
        }
    }
}
