package com.bridgelabz.encapsulation;

class FullTimeEmployee extends Employee implements Department {
    private float totalSalary;
    private String department;
    protected float bonus;

    public FullTimeEmployee(int employeeId, String employeeName, float baseSalary, float bonus) {
        super(employeeId, employeeName, baseSalary);
        this.bonus = bonus;
    }

    public float calculateSalary() {
        totalSalary = getBaseSalary() + bonus;
        return totalSalary;
    }

    public void assignDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentDetails() {
        return department;
    }
}
