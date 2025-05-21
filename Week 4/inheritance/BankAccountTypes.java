package com.bridgelabz.inheritance;

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount(1, 1000, 5);
        savingsAccount.displayAccountType();
        savingsAccount.displayDetails();

        CheckingAccount checkingAccount=new CheckingAccount(1, 1000, 10000);
        checkingAccount.displayAccountType();
        checkingAccount.displayDetails();

        FixedDepositAccount fixedDepositAccount=new FixedDepositAccount(1, 1000, 3);
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayDetails();
    }
}
