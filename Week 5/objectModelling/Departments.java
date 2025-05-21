package com.bridgelabz.objectModelling;

import java.util.ArrayList;

class Departments {
    ArrayList<Faculty> faculties;
    String departmentName;

    Departments(String departmentName) {
        this.departmentName = departmentName;
        faculties = new ArrayList<>();
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void displayDepartmentDetails() {
        System.out.println("\nFaculties in " + departmentName + " department : ");
        for (Faculty faculty : faculties) {
            faculty.getFacultyName();
        }
    }
}
