package com.bridgelabz.constructors;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter person name: ");
        String name=scanner.nextLine();
        System.out.println("Enter person age: ");
        int age=scanner.nextInt();
        System.out.println("Enter the person place of birth: ");
        String place=scanner.next();
        Person person=new Person(name, age, place);
        System.out.println("\nPerson details using parameterized constructor: ");
        person.displayDetails();
        Person personCopy=new Person(person);
        System.out.println("\nPerson details using copy constructor: ");
        personCopy.displayDetails();
        scanner.close();
    }
}
