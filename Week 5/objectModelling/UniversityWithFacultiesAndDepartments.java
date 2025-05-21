package com.bridgelabz.objectModelling;

public class UniversityWithFacultiesAndDepartments {
    public static void main(String[] args) {
        University university=new University("BridgeLabz");
        Departments departmentOne=new Departments("IT");
        Departments departmentTwo=new Departments("HR");
        Faculty facultyOne=new Faculty("Ravi");
        Faculty facultyTwo=new Faculty("Suresh");
        Faculty facultyThree=new Faculty("Harry");
        Faculty facultyFour=new Faculty("Kishore");
        university.addDepartment(departmentOne);
        departmentOne.addFaculty(facultyOne);
        departmentTwo.addFaculty(facultyThree);
        university.addDepartment(departmentTwo);
        departmentOne.addFaculty(facultyTwo);
        departmentTwo.addFaculty(facultyFour);

        university.displayUniversityDetails();
        departmentOne.displayDepartmentDetails();
        departmentTwo.displayDepartmentDetails();
        university.removeUniversity();
        System.out.println("\nChecking university details after removing university to ensure composition");
        university.displayUniversityDetails();

        System.out.println("\nChecking faculty details after removing department to ensure aggregation");
        facultyOne.getFacultyName();
        facultyTwo.getFacultyName();
        facultyThree.getFacultyName();
        facultyFour.getFacultyName();
    }
}
