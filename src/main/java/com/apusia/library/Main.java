package com.apusia.library;

import com.apusia.library.input.InputContext;
import com.apusia.library.input.ScannerInputAdapter;
import com.apusia.library.mainmenu.MainMenuController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /* Setup application configuration */
      InputContext.register(new ScannerInputAdapter());


        /* Run application */
        MainMenuController.getInstance().flow();
    }
}
