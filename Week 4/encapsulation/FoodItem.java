package com.bridgelabz.encapsulation;

abstract class FoodItem {
    protected String foodName;
    private int price;
    protected int quantity;

    public FoodItem(String foodName, int price, int quantity) {
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
    }

    public void getItemDetails() {
        System.out.println("\nFood name is: " + foodName);
        System.out.println("Food price is: " + price);
        System.out.println("Food quantity is: " + quantity);
    }

    public int getPrice() {
        return price;
    }

    abstract void calculateTotalPrice();
}
