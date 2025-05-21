package com.bridgelabz.inheritance;

class PersonDetails {
    private String name;
    private int id;

    public PersonDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
}
