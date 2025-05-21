package com.bridgelabz.encapsulation;

abstract class LibraryItem {
    private final int itemId;
    protected String title;
    protected String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public void getItemDetails() {
        System.out.println("\nItem Id : " + itemId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }

    abstract int getLoanDuration();
}
