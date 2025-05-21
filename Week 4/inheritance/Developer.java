package com.bridgelabz.inheritance;

class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        System.out.println("\nDeveloper Details:");
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
