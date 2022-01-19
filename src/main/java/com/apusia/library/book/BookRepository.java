package com.apusia.library.book;

import java.util.ArrayList;

public class BookRepository {
    private static BookRepository instance = new BookRepository();
    private ArrayList<Book> books = new ArrayList<>();

    private BookRepository(){}

    static BookRepository getInstance(){
        return instance;
    }

    void add(Book book){
        books.add(book);
    }

    ArrayList<Book> get(){
        return books;
    }
}
