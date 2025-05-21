package com.bridgelabz.constructors;

class Person {
    String name;
    int age;
    String place;

    Person(String name, int age, String place) {
        this.name = name;
        this.age = age;
        this.place = place;
    }

    Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.place = person.place;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Place of Birth: " + place);
    }
}
