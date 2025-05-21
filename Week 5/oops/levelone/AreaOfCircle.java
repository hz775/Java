package com.bridgelabz.oops.levelone;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        Scanner scanner=new Scanner(System.in);
        int radius=scanner.nextInt();
        Circle circle=new Circle();
        circle.radius=radius;
        circle.displayResults();
        scanner.close();
    }
}