package com.bridgelabz.inheritance;

class BankAccount {
    private int accountNumber;
    private float balance;

    public BankAccount(int accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
