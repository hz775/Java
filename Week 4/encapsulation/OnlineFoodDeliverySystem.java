package com.bridgelabz.encapsulation;

import java.util.ArrayList;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        ArrayList<FoodItem> foodItems=new ArrayList<>();
        foodItems.add(new VegItem("Paneer", 100, 2));
        foodItems.add(new NonVegItem("Chicken", 200, 3));

        for(FoodItem foodItem:foodItems) {
            foodItem.getItemDetails();
            foodItem.calculateTotalPrice();
            ((Discountable) foodItem).getDiscountDetails();
            ((Discountable) foodItem).applyDiscount();
        }
    }
}