package com.bridgelabz.inheritance;

class SavingsAccount extends BankAccount {
    private float interestRate;

    public SavingsAccount(int accountNumber, float balance, float interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("\nSavings Account Details");
        System.out.println("Interest rate: " + interestRate);
    }
}
