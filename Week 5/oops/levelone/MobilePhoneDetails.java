package com.bridgelabz.oops.levelone;

import java.util.Scanner;

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the brand name,model and price of mobile: ");
        String brandName = input.nextLine();
        String model = input.nextLine();
        int price = input.nextInt();
        MobilePhone mobile=new MobilePhone();
        mobile.brandName=brandName;
        mobile.model=model;
        mobile.price=price;
        mobile.displayDetails();
    }
}
