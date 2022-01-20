package com.apusia.library.book;

public class Book {
    private Status status;
    private String title;
    private String author;

    Book(Status status, String title, String author) {
        this.status = status;
        this.title = title;
        this.author = author;
    }

    public Status getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    enum Status {
        RESERVED,
        FREE,
        RENTED;
    }
}
