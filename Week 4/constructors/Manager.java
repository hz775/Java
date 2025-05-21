package com.bridgelabz.constructors;

class Manager extends Employee {
    public Manager(int employeeID, String department) {
        super(employeeID, department);
    }

    public void displayDetails() {
        System.out.println("\nEmployee ID accessed using super: " + employeeID);
        System.out.println("Department accessed using super from parent class: " + department);
        System.out.println("Salary accessed using setter and getter: " + getSalary());
    }
}
