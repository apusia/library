package com.apusia.library.main;

import com.apusia.library.Flow;
import com.apusia.library.book.AddController;
import com.apusia.library.book.DeleteController;
import com.apusia.library.book.PreviewController;

import java.util.Scanner;

public class MainController implements Flow {
    private static MainController instance = new MainController();
    private MainView view = MainView.getInstance();

    private Scanner keyboard = new Scanner(System.in);

    private MainController() {
    }

    public static MainController getInstance() {
        return MainController.instance;
    }

    @Override
    public void flow() {
        view.print();
        String input = keyboard.nextLine().toLowerCase();
        if (input.length() != 1) {
            System.out.println("Proszę wpisać 1 znak");
            flow();
        }

        switch (input) {
            case "1":
                PreviewController.getInstance().flow();
                break;
            case "2":
                AddController.getInstance().flow();
                break;
            case "3":
                DeleteController.getInstance().flow();
                break;
            case "q":
                System.exit(0);
                break;
            default:
                flow();
        }

        input.toString();
    }
}
