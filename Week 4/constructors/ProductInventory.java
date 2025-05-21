package com.bridgelabz.constructors;

public class ProductInventory {
    public static void main(String[] args){

        Product productOne=new Product("Laptops",10000);
        Product productTwo=new Product("Chairs",200);
        Product productThree=new Product("Keyboards",3000);

        productOne.displayProductDetails();
        productTwo.displayProductDetails();
        productThree.displayProductDetails();

        Product.displayTotalProducts();

    }
}
