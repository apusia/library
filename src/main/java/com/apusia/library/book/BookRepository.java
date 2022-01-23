package com.apusia.library.book;

import com.apusia.library.StorageHelper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BookRepository {
    /* SINGLETON */
    private static BookRepository instance = null;

    /* STORAGE */
    private final PrintWriter booksStorage = new PrintWriter(new StorageHelper().getFile(StorageHelper.Storage.BOOKS));
    private final ObjectMapper objectMapper = new ObjectMapper();

    /* MEMORY */
    private final ArrayList<Book> booksMemory = new ArrayList<>();

    private BookRepository() throws IOException {}

    static BookRepository getInstance() throws IOException {
        if( instance == null ){
            instance = new BookRepository();
        }
        return instance;
    }

    void add(Book book){
        booksMemory.add(book);
        try {
            String bookJson = objectMapper.writeValueAsString(book);
            booksStorage.println(bookJson);
            booksStorage.flush();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    ArrayList<Book> get(){
        return booksMemory;
    }
}
