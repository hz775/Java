package com.bridgelabz.oops.leveltwo;

import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter roll number: ");
        int rollNumber=scanner.nextInt();
        System.out.println("Enter name of student : ");
        String name=scanner.next();
        System.out.println("Enter number of subjects: ");
        int numberOfSubjects=scanner.nextInt();
        System.out.println("Enter total marks : ");
        int marks=scanner.nextInt();
        Student student=new Student();

        student.rollNumber=rollNumber;
        student.name=name;
        student.marks=marks;
        student.numberOfSubjects=numberOfSubjects;

        student.displayDetails();
        student.calculateGrade();
        scanner.close();
    }
}