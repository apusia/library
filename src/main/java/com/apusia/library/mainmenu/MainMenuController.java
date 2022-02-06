package com.apusia.library.mainmenu;

import com.apusia.library.Flow;
import com.apusia.library.book.AddController;
import com.apusia.library.book.DeleteController;
import com.apusia.library.book.PreviewController;
import com.apusia.library.input.DataInputContext;

import java.io.IOException;

import static com.apusia.library.input.DataInputContext.getDataInput;

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
        String input = getDataInput().nextLine().toLowerCase();
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
    }
}
