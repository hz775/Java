package com.bridgelabz.constructors;

import java.util.Scanner;

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter account number: ");
        long accountNumber=scanner.nextLong();
        System.out.println("Enter account holder: ");
        String accountHolder=scanner.next();
        System.out.println("Enter balance: ");
        double balance=scanner.nextDouble();

        SavingsAccount account = new SavingsAccount(accountNumber, accountHolder);
        account.setOrModifyBalance(balance);;

        account.displayDetails();

        System.out.println("\nEnter new balance to modify: ");
        account.setOrModifyBalance(scanner.nextDouble());

        System.out.println("Account details after modifying balance: ");
        account.displayDetails();

    }
}