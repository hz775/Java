package com.bridgelabz.objectModelling;

public class CompanyAndDepartments {
    public static void main(String[] args) {
        //Create employee objects
        Employee employeeOne=new Employee(101, "Ravi");
        Employee employeeTwo=new Employee(102, "Suresh");
        Employee employeeThree=new Employee(103, "Harry");
        Employee employeeFour=new Employee(104, "John");
        //Create department objects
        Department departmentOne=new Department("IT");
        Department departmentTwo=new Department("HR");
        //Add employee objects to department
        departmentOne.addEmployee(employeeOne);
        departmentOne.addEmployee(employeeTwo);
        departmentTwo.addEmployee(employeeThree);
        departmentTwo.addEmployee(employeeFour);
        //Add departments to company
        Company company=new Company("BridgeLabz");
        company.addDepartment(departmentOne);
        company.addDepartment(departmentTwo);

        company.displayCompanyDetails();
        departmentOne.displayDepartmentDetails();
        departmentTwo.displayDepartmentDetails();

        System.out.println("\nDeleting department one details");
        departmentOne.deleteDepartment();
        departmentOne.displayDepartmentDetails();

        System.out.println("\nDeleting company details");
        company.deleteCompany();
        company.displayCompanyDetails();
    }
}