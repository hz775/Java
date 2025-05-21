package com.bridgelabz.constructors;

import java.util.Scanner;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name: ");
        String name=scanner.nextLine();
        System.out.println("Student roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.println("Student CGPA: ");
        double CGPA=scanner.nextDouble();
        PostGraduateStudent postGraduateStudent = new PostGraduateStudent(name,rollNumber,CGPA);
        System.out.println("\nStudent details: ");
        postGraduateStudent.displayDetails(CGPA);
        postGraduateStudent.modifyCgpa(9.0);
        double newCGPA= postGraduateStudent.getCgpa();
        System.out.println("\nStudent details after modification: ");
        postGraduateStudent.displayDetails(newCGPA);
        scanner.close();
    }
}