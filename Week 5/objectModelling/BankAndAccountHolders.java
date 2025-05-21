package com.bridgelabz.objectModelling;

public class BankAndAccountHolders {
    public static void main(String[] args) {

        //Creating bank object
        Bank bankOne = new Bank("ICICI");
        Bank bankTwo = new Bank("SBI");

        // Creating customers and associating them with banks
        Customer customerOne = new Customer("Ravi", 10000, bankOne);
        Customer customerTwo = new Customer("Suresh", 20000, bankOne);
        Customer customerThree = new Customer("Harry", 30000, bankTwo);

        // Displaying bank customers
        bankOne.displayCustomers();
        bankTwo.displayCustomers();

        // Checking balance
        System.out.println("\nChecking individual balances:");
        customerOne.viewBalance();
        customerTwo.viewBalance();
        customerThree.viewBalance();

        //To get bank details of customers
        System.out.println("\nCustomer one has an account in bank : "+customerOne.getBank());
        System.out.println("Customer two has an account in bank : "+customerTwo.getBank());
        System.out.println("Customer three has an account in bank : "+customerThree.getBank());
    }
}
