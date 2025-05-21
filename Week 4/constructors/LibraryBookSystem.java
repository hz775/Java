package com.bridgelabz.constructors;
import java.util.Scanner;

public class LibraryBookSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the title,author and price of the book: ");
        String title=scanner.nextLine();
        String author=scanner.nextLine();
        int price=scanner.nextInt();
        System.out.println("Enter how many books does the user wants: ");
        int requiredBooks=scanner.nextInt();
        BookAvailability bookAvailability=new BookAvailability(title, author, price);
        bookAvailability.borrowBook(requiredBooks);
        scanner.close();
    }
}
