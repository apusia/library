package com.apusia.library.book;

import com.apusia.library.Flow;

public class PreviewController implements Flow {
    private static PreviewController instance = new PreviewController();

    private PreviewController(){
    }

    public static PreviewController getInstance(){
        return instance;
    }

    @Override
    public void flow() {

    }
}
