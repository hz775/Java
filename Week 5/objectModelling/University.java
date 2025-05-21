package com.bridgelabz.objectModelling;

import java.util.ArrayList;

class University {
    ArrayList<Departments> departments;
    String universityName;

    University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
    }

    void addDepartment(Departments departments) {
        this.departments.add(departments);
    }

    void removeUniversity() {
        System.out.println("\nUniversity " + universityName + " is being removed.");
        universityName = " ";
        System.out.println("All departments are deleted in university.");
        departments = null;
    }

    void displayUniversityDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Departments in university : ");
        try {
            for (Departments department : departments) {
                System.out.println("Department Name: " + department.departmentName);
            }
        } catch (NullPointerException e) {
            System.out.println("No departments are there in university.");
        }
    }
}
