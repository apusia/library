package com.apusia.library.book;

import com.apusia.library.Flow;

public class AddController implements Flow {
    private static AddController instance = new AddController();

    private AddController(){
    }

    public static AddController getInstance(){
        return instance;
    }

    @Override
    public void flow() {
//        new Book("1", Book.Status.FREE, "Inni","S.King");

    }
}
