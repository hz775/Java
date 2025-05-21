package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Bank class, to store multiple customers
class Bank {
    private String bankName;
    private ArrayList<Customer> customerList;

    Bank(String bankName) {
        this.bankName = bankName;
        this.customerList = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customerList.add(customer);
    }

    public void displayCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer customer : customerList) {
            System.out.println(customer.getName() + "  Balance: " + customer.getBalance());
        }
    }

    public String getBankName() {
        return bankName;
    }
}
