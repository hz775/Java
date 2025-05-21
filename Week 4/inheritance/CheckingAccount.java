package com.bridgelabz.inheritance;

class CheckingAccount extends BankAccount {
    private float withdrawalLimit;

    public CheckingAccount(int accountNumber, float balance, float withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("\nChecking Account Details");
        System.out.println("Withdrawal limit: " + withdrawalLimit);
    }
}
