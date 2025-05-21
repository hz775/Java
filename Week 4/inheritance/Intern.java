package com.bridgelabz.inheritance;

class Intern extends Employee {

    private String department;

    public Intern(String name, int id, int salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("\nIntern Details:");
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
