package com.bridgelabz.encapsulation;

class Magazine extends LibraryItem implements Reservable {
    static int totalMagazines = 10;
    int limit = 10;

    Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return limit;
    }

    public void reserveItem(int days) {
        if (days > limit) {
            System.out.println("Loan duration limit is 15 days so can't be reserved.");
        } else {
            System.out.println("Reserved for " + days + " days.");
        }
        totalMagazines -= 1;
    }

    public boolean checkAvailability() {
        return totalMagazines > 0;
    }
}
