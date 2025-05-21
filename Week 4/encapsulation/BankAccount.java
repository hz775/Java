package com.bridgelabz.encapsulation;

abstract class BankAccount {
    private long accountNumber;
    private String accountHolder;
    protected double balance;

    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            System.out.println("Withdrawing amount: " + amount);
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    abstract void calculateInterest();
}
