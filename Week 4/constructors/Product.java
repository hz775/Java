package com.bridgelabz.constructors;

class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product name is: " + productName);
        System.out.println("Product price is: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total products: " + totalProducts);
    }
}
