package com.apusia.library.book;

import com.apusia.library.Flow;

public class DeleteController implements Flow {
    private static DeleteController instance = new DeleteController();

    private DeleteController() {
    }

    public static DeleteController getInstance() {
        return instance;
    }

    @Override
    public void flow() {
    }
}
