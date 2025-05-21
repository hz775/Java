package com.bridgelabz.oops.leveltwo;

class Student {
    String name;
    int rollNumber;
    int marks, numberOfSubjects;

    void calculateGrade() {
        float percentage = ((float) marks) / (numberOfSubjects * 100) * 100;
        System.out.println("Percentage: " + String.format("%.2f", percentage));
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Total marks received by student : " + marks);
    }
}
