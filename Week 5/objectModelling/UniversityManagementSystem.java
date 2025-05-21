package com.bridgelabz.objectModelling;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Professors
        Professor professor1 = new Professor("Ravi");
        Professor professor2 = new Professor("Manish");

        // Create Students
        StudentEnrollment student1 = new StudentEnrollment("Kuladeep", 101);
        StudentEnrollment student2 = new StudentEnrollment("Rahul", 102);

        // Create Courses
        CourseDetails course1 = new CourseDetails("Mathematics");
        CourseDetails course2 = new CourseDetails("Computer Science");

        // Assign Professors to Courses
        professor1.addCourse(course1);
        professor2.addCourse(course2);

        // Enroll Students in Courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Assign Professors to Students
        student1.assignProfessor(professor1);
        student1.assignProfessor(professor2);
        student2.assignProfessor(professor1);

        // Display Course and Student Details
        professor1.displayCourseDetails();
        professor2.displayCourseDetails();

        student1.displayCourseDetails();
        student2.displayCourseDetails();
    }
}
