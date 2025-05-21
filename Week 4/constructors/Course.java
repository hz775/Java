package com.bridgelabz.constructors;

class Course {
    String courseName;
    int duration;
    int fee;
    static String instituteName = "Udemy";

    Course(String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course name is: " + courseName);
        System.out.println("Duration is: " + duration);
        System.out.println("Fee is: " + fee);
        System.out.println("Institute name is: " + instituteName);
    }

    void updateInstituteName(String instituteName) {
        Course.instituteName = instituteName;
    }

}
