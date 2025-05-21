package com.bridgelabz.oops.leveltwo;

import java.util.Scanner;

public class SimulateATM {
    public static void main(String[] args ){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the account holder: ");
        String accountHolder=scanner.nextLine();
        System.out.println("Enter the account number: ");
        long accountNumber=scanner.nextLong();
        System.out.println("Enter the amount to be deposited: ");
        long depositingMoney=scanner.nextInt();
        System.out.println("Enter the amount to be withdrawn: ");
        long withdrawingMoney=scanner.nextInt();
        BankAccount bankAccount=new BankAccount();
        bankAccount.accountHolder=accountHolder;
        bankAccount.accountNumber=accountNumber;
        bankAccount.depositingMoney(depositingMoney);
        bankAccount.withdrawingMoney(withdrawingMoney);
        bankAccount.displayBalance();
        scanner.close();
    }
}
