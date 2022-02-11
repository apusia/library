package com.apusia.library.mainmenu;

import com.apusia.library.Flow;
import com.apusia.library.book.AddController;
import com.apusia.library.book.DeleteController;
import com.apusia.library.book.PreviewController;
import com.apusia.library.input.ScannerInputAdapter;

import java.io.IOException;

import static com.apusia.library.input.InputContext.getInput;

public class MainMenuController implements Flow {
    private static final MainMenuController instance = new MainMenuController();
    private final MainView view = MainView.getInstance();

    private MainMenuController() {
    }

    public static MainMenuController getInstance() {
        return MainMenuController.instance;
    }

    @Override
    public void flow() throws IOException {
        view.print();
        String input = getInput().nextLine().toLowerCase();
        if (input.length() != 1) {
            System.out.println("Proszę wpisać 1 znak");
            flow();
        }

        switch (input) {
            case "1" -> PreviewController.getInstance().flow();
            case "2" -> AddController.getInstance().flow();
            case "3" -> DeleteController.getInstance().flow();
            case "q" -> System.exit(0);
            default -> flow();
        }
    }
}
