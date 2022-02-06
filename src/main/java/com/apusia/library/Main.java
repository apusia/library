package com.apusia.library;

import com.apusia.library.input.DataInputContext;
import com.apusia.library.input.ScannerDataInput;
import com.apusia.library.mainmenu.MainMenuController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputContext.register(new ScannerDataInput());
        MainMenuController.getInstance().flow();
    }
}
