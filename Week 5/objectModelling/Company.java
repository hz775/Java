package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Company class, stores company,department and employee details
class Company {
    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    //To add department details
    void addDepartment(Department department) {
        departments.add(department);
    }

    //It deletes all details departments,employee details and company name
    void deleteCompany() {
        companyName = " ";
        departments = null;
        System.out.println("All details of company is deleted");
    }

    //To display company details
    void displayCompanyDetails() {
        System.out.println("\nDepartments in company : ");
        System.out.println("Company Name: " + companyName);
        try {
            for (Department department : departments) {
                System.out.println(department.departmentName);
            }
        } catch (NullPointerException e) {
            System.out.println("No departments are there in company.");
        }
    }
}
