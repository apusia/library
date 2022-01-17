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

    enum Status {
        RESERVED,
        FREE,
        RENTED;
    }
}
