package com.bridgelabz.inheritance;

class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("Manager Details:");
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
