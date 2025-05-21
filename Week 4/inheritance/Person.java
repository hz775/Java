package com.bridgelabz.inheritance;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
    }
}
