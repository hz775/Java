package com.bridgelabz.inheritance;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Suresh", 1002, 20000, 5);
        manager.displayDetails();

        Developer developer = new Developer("Ravi", 1001, 15000, "Java");
        developer.displayDetails();

        Intern intern = new Intern("Harry", 1003, 10000, "IT");
        intern.displayDetails();
    }
}