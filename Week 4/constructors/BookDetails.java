package com.bridgelabz.constructors;

import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the title,author and price of the book: ");
        String title=scanner.nextLine();
        String author=scanner.nextLine();
        int price=scanner.nextInt();
        Books bookOne=new Books();
        Books bookTwo=new Books(title, author, price);
        System.out.println("\nThe details using default constructor: ");
        bookOne.display();
        System.out.println("\nThe details using parameterized constructor: ");
        bookTwo.display();
        scanner.close();
    }
}