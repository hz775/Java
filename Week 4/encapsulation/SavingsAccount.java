package com.bridgelabz.encapsulation;

class SavingsAccount extends BankAccount implements Loanable {
    private int interestRate = 5;

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void calculateInterest() {
        balance += balance * interestRate / 100;
    }

    public void applyForLoan(double amount) {
        if (amount < calculateLoanEligibility()) {
            System.out.println("Taking loan of amount: " + amount);
            System.out.println("Loan is applied through savings account");
        }
    }

    public double calculateLoanEligibility() {
        return 2 * balance;
    }
}
