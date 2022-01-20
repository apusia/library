package com.apusia.library

import com.apusia.library.book.Book
import com.fasterxml.jackson.databind.ObjectMapper
import spock.lang.Specification

class FileUT extends Specification {

    def "asd"() {
    expect:
        ObjectMapper objectMapper = new ObjectMapper();
        def book1 = new Book(Book.Status.FREE, "IT", "King");
        def book2 = new Book(Book.Status.FREE, "IT2", "King");

        ArrayList<Book> books = [ book1,book2 ]

        def result = objectMapper.writeValueAsString(book1);
        def results = objectMapper.writeValueAsString(books);
        true
    }

}
