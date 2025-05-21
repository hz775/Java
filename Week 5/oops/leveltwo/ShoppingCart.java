package com.bridgelabz.oops.leveltwo;

public class ShoppingCart {
    public static void main(String[] args) {

        CartItems cartItem=new CartItems();

        cartItem.addItem(1,"Chair",600,1);
        cartItem.addItem(2,"Keyboard",2000,2);
        cartItem.addItem(3,"Mouse",800,3);

        cartItem.addQuantity(1,2);
        cartItem.addQuantity(3,1);

        cartItem.decreaseQuantity(3,2);
        cartItem.decreaseQuantity(1,1);

        cartItem.displayBill();

    }
}
