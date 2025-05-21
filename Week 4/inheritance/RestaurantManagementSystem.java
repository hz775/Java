package com.bridgelabz.inheritance;

public class RestaurantManagementSystem {
    public static void main(String[] args){
        Chef chef=new Chef("Suresh", 1002, "Indian");
        chef.performDuties();
        chef.displayDetails();

        Waiter waiter=new Waiter("Harry", 1001, 2);
        waiter.performDuties();
        waiter.displayDetails();
    }
}
