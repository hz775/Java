package com.bridgelabz.encapsulation;

abstract class Product {
    private int productId;
    protected String productName;
    private double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return productPrice;
    }

    public void setPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    abstract double calculateDiscount();
}
