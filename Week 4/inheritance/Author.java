package com.bridgelabz.inheritance;

class Author extends Book {

    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayDetails() {
        System.out.println("Book title: " + getTitle());
        System.out.println("Publication year: " + getPublicationYear());
        System.out.println("Author name: " + name);
        System.out.println("Author bio: " + bio);
    }
}
