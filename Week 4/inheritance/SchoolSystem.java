package com.bridgelabz.inheritance;

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Ravi", 20, "Maths");
        teacher.displayDetails();
        teacher.displayRole();

        Student student=new Student("Suresh", 20, "10th");
        student.displayDetails();
        student.displayRole();

        Staff staff=new Staff("Manish", 20, "Networking");
        staff.displayDetails();
        staff.displayRole();
    }
}
