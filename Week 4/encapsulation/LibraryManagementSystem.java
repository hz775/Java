package com.bridgelabz.encapsulation;

import java.util.ArrayList;

public class LibraryManagementSystem {
    public static void main(String[] args){
        ArrayList<LibraryItem> libraryItems=new ArrayList<>();

        libraryItems.add(new Book(1,"Sherlock Holmes","Walter White"));
        libraryItems.add(new Book(2,"The Hobbit","JRR Tolkien"));
        libraryItems.add(new Magazine(4,"The Hitchhiker's Guide to the Galaxy","Henry Mitchel"));
        libraryItems.add(new Magazine(202, "National Geographic", "National Geographic Society"));
        libraryItems.add(new DVD(303, "Inception", "Christopher Nolan"));

        for(LibraryItem libraryItem:libraryItems){
            libraryItem.getItemDetails();
            System.out.println("Required loan duration is "+libraryItem.getLoanDuration());
            ((Reservable) libraryItem).reserveItem(10);
            System.out.println("Availability: "+((Reservable) libraryItem).checkAvailability());
        }
    }
}
