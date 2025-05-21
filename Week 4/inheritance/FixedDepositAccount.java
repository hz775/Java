package com.bridgelabz.inheritance;

class FixedDepositAccount extends BankAccount {
    private int depositPeriod;

    public FixedDepositAccount(int accountNumber, float balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    public void displayAccountType() {
        System.out.println("\nFixed Deposit Account Details");
        System.out.println("Deposit period: " + depositPeriod);
    }
}
