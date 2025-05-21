package com.bridgelabz.inheritance;

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, double trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public void displayDetails() {
        System.out.println("Order Id: " + getOrderId());
        System.out.println("Order Date: " + getOrderDate());
        System.out.println("Tracking Number: " + getTrackingNumber());
        System.out.println("Delivery Date: " + deliveryDate);
    }

}
