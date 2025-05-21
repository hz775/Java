package com.bridgelabz.objectModelling;

public class SchoolAndStudentWithCourses {
    public static void main(String[] args) {
        //Creating school objects
        School schoolOne=new School("Sri Chaitanya");
        School schoolTwo=new School("Narayana");
        //Creating course objects
        Course courseOne=new Course("Java");
        Course courseTwo=new Course("C++");
        Course courseThree=new Course("Python");
        //Creating student objects
        Student studentOne=new Student("Ravi");
        Student studentTwo=new Student("Suresh");
        Student studentThree=new Student("Harry");
        //Add students in schools
        schoolOne.addStudent(studentOne);
        schoolTwo.addStudent(studentTwo);
        schoolTwo.addStudent(studentThree);
        //Display students
        schoolOne.displayStudents();
        schoolTwo.displayStudents();
        //Enroll students in courses
        studentOne.enrollInCourse(courseOne);
        studentOne.enrollInCourse(courseTwo);

        studentTwo.enrollInCourse(courseTwo);
        studentTwo.enrollInCourse(courseThree);

        studentThree.enrollInCourse(courseThree);
        studentThree.enrollInCourse(courseOne);
        studentThree.enrollInCourse(courseTwo);

        System.out.println("\nUsing relationship between course and student");
        System.out.println("Student can view their enrolled courses");
        studentOne.displayCourses();
        studentTwo.displayCourses();
        studentThree.displayCourses();

        System.out.println("\nStudents in each course are: ");
        courseOne.displayEnrolledStudents();
        courseTwo.displayEnrolledStudents();
        courseThree.displayEnrolledStudents();
    }
}