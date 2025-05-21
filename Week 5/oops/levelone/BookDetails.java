package com.bridgelabz.oops.levelone;

import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the title,author and price of the book: ");
        String title=scanner.nextLine();
        String author=scanner.nextLine();
        int price=scanner.nextInt();
        Book book=new Book();
        book.title=title;
        book.author=author;
        book.price=price;
        book.display();
        scanner.close();
    }
}