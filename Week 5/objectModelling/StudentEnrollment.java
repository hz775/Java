package com.bridgelabz.objectModelling;

import java.util.ArrayList;

class StudentEnrollment {
    String studentName;
    int rollNumber;
    ArrayList<CourseDetails> courseDetails;
    ArrayList<Professor> professors;

    StudentEnrollment(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        courseDetails = new ArrayList<>();
        professors = new ArrayList<>();
    }

    void enrollCourse(CourseDetails courseDetails) {
        this.courseDetails.add(courseDetails);
    }

    void assignProfessor(Professor professor) {
        professors.add(professor);
        professor.addStudent(this);
    }

    void displayCourseDetails() {
        System.out.println(studentName + " is enrolled in following courses:");
        for (CourseDetails courseDetails : courseDetails) {
            System.out.println(courseDetails.courseName);
        }
        System.out.println("\n" + studentName + " is assigned to following professors:");
        for (Professor professor : professors) {
            System.out.println(professor.getProfessorDetails());
        }
    }
}
