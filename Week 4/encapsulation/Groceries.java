package com.bridgelabz.encapsulation;

class Groceries extends Product implements Taxable {
    protected float taxPercentage = 10;
    protected double totalAmount;

    public Groceries(int productId, String productName, double productPrice) {
        super(productId, productName, productPrice);
    }

    public double calculateDiscount() {
        totalAmount = getPrice() * 5 / 100;
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
