package com.apusia.library;

import com.apusia.library.main.MainController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MainController.getInstance().flow();
    }
}
