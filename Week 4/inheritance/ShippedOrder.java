package com.bridgelabz.inheritance;

class ShippedOrder extends Order {
    private double trackingNumber;

    public ShippedOrder(int orderId, String orderDate, double trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public double getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(double trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
