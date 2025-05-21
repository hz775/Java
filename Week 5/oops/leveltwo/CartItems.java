package com.bridgelabz.oops.leveltwo;

import java.util.ArrayList;

class CartItems {
    double bill = 0;
    ArrayList<Item> cartItems = new ArrayList<>();

    void addItem(int idOfItem, String name, double price, int numberOfQuantity) {
        cartItems.add(new Item(idOfItem, name, price, numberOfQuantity));
    }

    void addQuantity(int idOfItem, int numberOfItems) {
        for (Item item : cartItems) {
            if (item.idOfItem == idOfItem) {
                item.quantity += numberOfItems;
            }
        }
    }

    void decreaseQuantity(int idOfItem, int numberOfQuantity) {
        for (Item item : cartItems) {
            if (item.idOfItem == idOfItem && item.quantity >= numberOfQuantity)
                item.quantity -= numberOfQuantity;
        }
    }

    void displayBill() {
        for (Item item : cartItems) {
            System.out.println("\nItem details: " + item.idOfItem + " " + item.name + " " + item.price + " " + item.quantity);
            System.out.println("Amount: " + (item.price * item.quantity));
            bill += item.price * item.quantity;
        }
        System.out.println("\nTotal bill amount is: " + bill);
    }
}
