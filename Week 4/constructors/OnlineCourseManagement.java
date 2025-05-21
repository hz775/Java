package com.bridgelabz.constructors;

import java.util.Scanner;

public class OnlineCourseManagement {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the course name: ");
        String courseName=scanner.nextLine();
        System.out.println("Enter the course duration in minutes: ");
        int duration=scanner.nextInt();
        System.out.println("Enter the course fee: ");
        int fee=scanner.nextInt();
        Course course=new Course(courseName, duration, fee);
        course.displayCourseDetails();
        System.out.println("Enter the institute name to update: ");
        String instituteName=scanner.next();
        course.updateInstituteName(instituteName);
        System.out.println("The details after updating: ");
        course.displayCourseDetails();
        scanner.close();
    }
}
