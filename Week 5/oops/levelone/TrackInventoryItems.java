package com.bridgelabz.oops.levelone;

import java.util.*;

public class TrackInventoryItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the item name, item code, price and quantity: ");
        String itemName = scanner.nextLine();
        String itemCode = scanner.nextLine();
        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        Item item = new Item();
        item.itemName = itemName;
        item.itemCode = itemCode;
        item.price = price;
        item.quantity = quantity;

        item.displayItemDetails();
        scanner.close();
    }
}
