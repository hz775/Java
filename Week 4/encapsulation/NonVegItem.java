package com.bridgelabz.encapsulation;

class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharges = 70;
    private float discount = 8;
    private double totalPrice;

    public NonVegItem(String foodName, int price, int quantity) {
        super(foodName, price, quantity);
    }

    public void calculateTotalPrice() {
        totalPrice = getPrice() * quantity + additionalCharges;
        System.out.println("Additional charges: " + additionalCharges);
        System.out.println("Total price of the food before discount is: " + totalPrice);
    }

    @Override
    public void applyDiscount() {
        double discountPrice = totalPrice - (totalPrice * discount / 100);
        System.out.println("After discount applied on the food, price is: " + discountPrice);
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount applied on the food is: " + discount + "%");
    }
}
