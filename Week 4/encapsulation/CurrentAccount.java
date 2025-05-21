package com.bridgelabz.encapsulation;

class CurrentAccount extends BankAccount implements Loanable {
    private int overdraftLimit = 15000;

    public CurrentAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void calculateInterest() {
        System.out.println("Interest is not applicable for current account");
    }

    public void withdraw(double amount) {
        if (amount < balance + overdraftLimit) {
            System.out.println("Withdrawing amount: " + amount);
            balance -= amount;
        } else {
            System.out.println("Insufficient balance amount can't be withdrawn");
        }
    }

    public void applyForLoan(double amount) {
        if (amount < calculateLoanEligibility()) {
            System.out.println("Taking loan of amount: " + amount);
            System.out.println("Loan is applied through current account");
        } else {
            System.out.println("Loan is not applicable");
        }
    }

    public double calculateLoanEligibility() {
        return balance + overdraftLimit;
    }
}
