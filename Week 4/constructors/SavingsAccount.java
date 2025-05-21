package com.bridgelabz.constructors;

class SavingsAccount extends BankAccount {
    public SavingsAccount(long accountNumber, String accountHolder) {
        super(accountNumber, accountHolder);
    }

    public void displayDetails() {
        System.out.println("\nAccount Number accessed using super: " + super.accountNumber);
        System.out.println("Account Holder accessed using super from parent class: " + super.accountHolder);
        System.out.println("Balance is accessed using setters and getters: " + getBalance());
    }
}
