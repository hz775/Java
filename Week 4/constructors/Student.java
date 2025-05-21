package com.bridgelabz.constructors;

class Student {
    protected String name;
    public int rollNumber;
    private double CGPA;

    Student(String name, int rollNumber, double CGPA) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.CGPA = CGPA;
    }

    public void modifyCgpa(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCgpa() {
        return this.CGPA;
    }
}
