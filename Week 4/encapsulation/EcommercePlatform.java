package com.bridgelabz.encapsulation;

import java.util.ArrayList;

public class EcommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();
        products.add(new Electronics(1,"Tv",70000));
        products.add(new Clothing(2,"Shirt",1000));
        products.add(new Groceries(3,"Flour",250));
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = ((Taxable) product).calculateTax();
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("\nProduct: " + product.productName);
            System.out.println("Original Price: " + product.getPrice());
            System.out.println("Discount amount: " + discount);
            System.out.println("Tax for product: " + tax);
            System.out.println("Final Price: " + finalPrice);

            System.out.println(((Taxable) product).getTaxDetails());
        }

    }
}
