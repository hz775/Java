package com.bridgelabz.constructors;

class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(long accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setOrModifyBalance(double balance) {
        this.balance = balance;
    }
}
