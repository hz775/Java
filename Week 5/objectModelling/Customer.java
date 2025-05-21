package com.bridgelabz.objectModelling;

//Customer class, to store customer details
class Customer {
    private String name;
    private int balance;
    private Bank bank;  // Link to the Bank (Association)

    Customer(String name, int balance, Bank bank) {
        this.name = name;
        this.balance = balance;
        this.bank = bank;
        bank.openAccount(this); // Automatically associate with the bank
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void viewBalance() {
        System.out.println(name + "'s balance: " + balance);
    }

    public String getBank() {
        return bank.getBankName();
    }
}
