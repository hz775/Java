package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Customer class
class CustomerOrder {
    String customerName;
    ArrayList<Order> Orders;

    CustomerOrder(String customerName) {
        this.customerName = customerName;
        Orders = new ArrayList<>();
    }

    //To add orders of specific customers
    void addOrder(Order order) {
        Orders.add(order);
    }

    //Display order details
    void getCustomerOrders() {
        System.out.println("\nCustomer name: " + customerName);
        for (Order order : Orders) {
            order.getOrderDetails();
        }
    }
}
