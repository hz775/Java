package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Student class, to store student and their course details
class Student {
    String studentName;
    ArrayList<Course> courses;

    Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    //Enrolling students in different courses
    void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudentInCourse(this);
    }

    void displayCourses() {
        System.out.println("\n" + studentName + " enrolled in  ");
        for (Course course : courses) {
            System.out.println(course.courseName);
        }
    }
}
