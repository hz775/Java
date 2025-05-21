package com.bridgelabz.constructors;

import java.util.Scanner;

public class BookLibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ISBN number: ");
        long ISBN=scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter the title: ");
        String title=scanner.nextLine();
        System.out.println("Enter the author: ");
        String author =scanner.nextLine();

        EBook eBook = new EBook(ISBN,title);
        eBook.setAuthor(author);
        eBook.displayDetails();
        scanner.close();
    }
}
