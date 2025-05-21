package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Order class
class Order {
    int orderID;
    ArrayList<Product> products;

    Order(int orderID) {
        this.orderID = orderID;
        products = new ArrayList<>();
    }

    //Add products to the order
    void addProduct(Product product) {
        products.add(product);
    }

    //Display the order details
    void getOrderDetails() {
        double totalCost = 0;
        System.out.println("Order ID: " + orderID);
        for (Product product : products) {
            System.out.println("Product name: " + product.productName + " - " + product.price);
            totalCost += product.price;
        }
        System.out.println("Total cost: " + totalCost);
    }
}
