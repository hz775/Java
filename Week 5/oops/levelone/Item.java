package com.bridgelabz.oops.levelone;

class Item {
    String itemName;
    String itemCode;
    int price;
    int quantity;

    public void displayItemDetails() {
        System.out.println("The code of the item is " + itemCode);
        System.out.println("The name of the item is " + itemName);
        System.out.println("The price of the item is " + price);
        System.out.println("The quantity of the item is " + quantity);
        System.out.println("The total cost of item is " + price * quantity);
    }
}
