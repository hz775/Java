package com.bridgelabz.oops.levelone;
import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the id,name and salary of the employee: ");
        int id=scanner.nextInt();
        scanner.nextLine();
        String name=scanner.nextLine();
        int salary=scanner.nextInt();
        Employee employee=new Employee();
        employee.id=id;
        employee.name=name;
        employee.salary=salary;

        employee.displayDetails();
        scanner.close();
    }
}
