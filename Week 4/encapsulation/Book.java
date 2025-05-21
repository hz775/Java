package com.bridgelabz.encapsulation;

class Book extends LibraryItem implements Reservable {
    private static int totalBooks = 10;
    private int limit = 15;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return limit;
    }

    public void reserveItem(int days) {
        if (days > limit) {
            System.out.println("Loan duration limit is 15 days so can't be reserved.");
        } else {
            System.out.println("Reserved for " + days + " days.");
        }
        totalBooks -= 1;
    }

    public boolean checkAvailability() {
        return totalBooks > 0;
    }
}
