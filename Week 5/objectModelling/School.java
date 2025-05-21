package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//School class,to store student details
class School {
    String schoolName;
    ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    //Adding students in school
    void addStudent(Student student) {
        students.add(student);
    }

    void displayStudents() {
        System.out.println("\nStudents in " + schoolName + " are: ");
        for (Student student : students) {
            System.out.println(student.studentName);
        }
    }
}
