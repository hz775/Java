package com.bridgelabz.encapsulation;

abstract class Employee {
    protected int employeeId;
    protected String employeeName;
    private float baseSalary;

    public Employee(int employeeId, String employeeName, float baseSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void displayDetails() {
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + baseSalary);
    }

    abstract float calculateSalary();
}
