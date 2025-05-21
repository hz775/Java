package com.bridgelabz.oops.leveltwo;

class BankAccount {
    long balance = 0;
    String accountHolder;
    long accountNumber;

    void depositingMoney(long depositingMoney) {
        balance += depositingMoney;
    }

    void withdrawingMoney(long withdrawingMoney) {
        if (withdrawingMoney < balance) {
            balance -= withdrawingMoney;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("The balance is " + balance);
    }
}
