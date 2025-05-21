package com.bridgelabz.constructors;

import java.util.Scanner;

public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int employeeID = scanner.nextInt();
        System.out.println("Enter Department Name: ");
        String department = scanner.next();
        System.out.println("Enter Salary: ");
        int salary = scanner.nextInt();
        Manager manager = new Manager(employeeID, department);
        manager.setOrModifySalary(salary);
        manager.displayDetails();

        System.out.println("\nEnter new salary to modify: ");
        int newSalary = scanner.nextInt();
        manager.setOrModifySalary(newSalary);
        System.out.println("\nDetails after modifying salary: ");
        manager.displayDetails();
    }
}
