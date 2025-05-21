package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Course class
class Course {
    String courseName;
    ArrayList<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    //Adding students to a particular course
    void enrollStudentInCourse(Student student) {
        students.add(student);
    }

    void displayEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println(student.studentName);
        }
    }
}
