package com.bridgelabz.constructors;

class Circle {
    int radius;

    Circle() {
        radius = 10;
    }

    Circle(int radius) {
        this.radius = radius;
    }

    public void displayResults() {

        System.out.println("The radius of circle is: " + radius);
    }
}
