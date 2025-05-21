package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Department class, stores Department and employee details
class Department {
    String departmentName;
    ArrayList<Employee> employees;

    //initialize attributes
    Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }

    //add employee details to department
    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    //deleted all department details and employees in that department
    void deleteDepartment() {
        departmentName = " ";
        employees = null;
        System.out.println("All details of this department is deleted");
    }

    //Display the details of department
    void displayDepartmentDetails() {
        try {
            System.out.println("\nDepartment Name: " + departmentName);
            for (Employee employee : employees) {
                System.out.println("Employee ID: " + employee.employeeID + " Employee Name: " + employee.employeeName);
            }
        } catch (NullPointerException e) {
            System.out.println("No employees are there in this department.");
        }
    }
}
