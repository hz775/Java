package com.bridgelabz.encapsulation;

class Clothing extends Product implements Taxable {
    protected float taxPercentage = 15;
    protected double totalAmount;

    public Clothing(int productId, String productName, double productPrice) {
        super(productId, productName, productPrice);
    }

    public double calculateDiscount() {
        totalAmount = getPrice() * 7 / 100;
        return totalAmount;
    }

    public double calculateTax() {
        totalAmount = calculateDiscount() * taxPercentage / 100;
        return totalAmount;
    }

    public String getTaxDetails() {
        return "Tax details are: " + taxPercentage + "%";
    }
}
