package com.bridgelabz.encapsulation;

import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee(1001, "Suresh", 100000, 10000));
        employees.add(new PartTimeEmployee(1002, "Ravi", 15000, 2, 500));

        for (Employee employee : employees) {
            employee.calculateSalary();
            ((Department) employee).assignDepartment(employee instanceof FullTimeEmployee ? "IT" : "Marketing");
            employee.displayDetails();
            System.out.println("Department: " + ((Department) employee).getDepartmentDetails());
            System.out.println("Salary: " + employee.calculateSalary() + "\n");
        }
    }
}
