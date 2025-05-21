package com.bridgelabz.oops.levelone;

class Circle {
    int radius;

    public void displayResults() {
        float area = 3.14f * radius * radius;
        float circumference = 2 * 3.14f * radius;
        System.out.println("The area of the circle is " + area);
        System.out.println("The circumference of the circle is " + circumference);
    }
}
