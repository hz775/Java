package com.bridgelabz.objectModelling;

public class ECommercePlatform {
    public static void main(String[] args) {
        CustomerOrder customer1 = new CustomerOrder("Ravi");
        CustomerOrder customer2 = new CustomerOrder("Suresh");

        // Create Products objects
        Product product1 = new Product("Laptop", 800.0);
        Product product2 = new Product("Headphones", 50.0);
        Product product3 = new Product("Phone", 500.0);

        // Create Orders objects
        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(102);
        order2.addProduct(product3);

        // Add Orders to Customers
        customer1.addOrder(order1);
        customer2.addOrder(order2);

        // Display Customer Orders
        customer1.getCustomerOrders();
        customer2.getCustomerOrders();
    }
}
