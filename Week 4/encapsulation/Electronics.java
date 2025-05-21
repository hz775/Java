package com.bridgelabz.encapsulation;

class Electronics extends Product implements Taxable {
    protected float taxPercentage = 18;
    protected double totalAmount;

    public Electronics(int productId, String productName, double productPrice) {
        super(productId, productName, productPrice);
    }

    public double calculateDiscount() {
        totalAmount = getPrice() * 10 / 100;
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
