package com.bridgelabz.encapsulation;

class VegItem extends FoodItem implements Discountable {
    private float discount = 10;
    private double totalPrice;

    public VegItem(String foodName, int price, int quantity) {
        super(foodName, price, quantity);
    }

    public void calculateTotalPrice() {
        totalPrice = getPrice() * quantity;
        System.out.println("Additional charges: " + 0);
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
