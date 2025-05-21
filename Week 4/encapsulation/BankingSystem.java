package com.bridgelabz.encapsulation;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(3212245, "Ravi", 200000);
        BankAccount currentAccount = new CurrentAccount(2165577, "Ravi", 150000);

        System.out.println("\nSavings account details: ");
        savingsAccount.displayDetails();
        savingsAccount.calculateInterest();

        System.out.println("Balance after adding interest rate: " + savingsAccount.balance);
        System.out.println("Loan Eligibility upto: " + ((Loanable) savingsAccount).calculateLoanEligibility());
        ((Loanable) savingsAccount).applyForLoan(20000);
        savingsAccount.calculateInterest();
        savingsAccount.withdraw(10000);

        System.out.println("Balance after withdrawal: " + savingsAccount.balance);

        System.out.println("\nCurrent account details: ");
        currentAccount.displayDetails();
        currentAccount.calculateInterest();

        System.out.println("Balance after adding interest rate: " + currentAccount.balance);
        System.out.println("Loan Eligibility upto: " + ((Loanable) currentAccount).calculateLoanEligibility());
        ((Loanable) currentAccount).applyForLoan(30000);
        currentAccount.calculateInterest();
        currentAccount.withdraw(25000);

        System.out.println("Balance after withdrawal: " + currentAccount.balance);
    }
}
