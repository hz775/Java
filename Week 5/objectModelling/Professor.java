package com.bridgelabz.objectModelling;

import java.util.ArrayList;

class Professor {
    String professorName;
    ArrayList<CourseDetails> courseDetails;
    ArrayList<StudentEnrollment> studentEnrollments;

    Professor(String professorName) {
        this.professorName = professorName;
        courseDetails = new ArrayList<>();
        studentEnrollments = new ArrayList<>();
    }

    void addStudent(StudentEnrollment studentEnrollment) {
        studentEnrollments.add(studentEnrollment);
    }

    void addCourse(CourseDetails courseDetails) {
        this.courseDetails.add(courseDetails);
    }

    void displayCourseDetails() {
        System.out.println(professorName + " teaches following courses:");
        for (CourseDetails courseDetails : courseDetails) {
            System.out.println(courseDetails.courseName);
        }

        System.out.println("\n" + professorName + " teaches following students:");
        for (StudentEnrollment studentEnrollment : studentEnrollments) {
            System.out.println(studentEnrollment.studentName);
        }
    }

    String getProfessorDetails() {
        return professorName;
    }
}
