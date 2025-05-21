package com.bridgelabz.constructors;

class Employee {
    public int employeeID;
    public String department;
    private int salary;

    Employee(int employeeID, String department) {
        this.employeeID = employeeID;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setOrModifySalary(int salary) {
        this.salary = salary;
    }
}
