package com.bridgelabz.constructors;

class Book {
    public long ISBN;
    protected String title;
    private String author;

    Book(long ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

}
