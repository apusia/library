package com.apusia.library.book;

import com.apusia.library.Flow;
import com.apusia.library.input.ScannerInputAdapter;
import com.apusia.library.mainmenu.MainMenuController;

import java.io.IOException;

import static com.apusia.library.input.InputContext.getInput;

public class AddController implements Flow {
    private static AddController instance = null;
    private final BookRepository bookRepository = BookRepository.getInstance();

    private AddController() throws IOException {
    }

    public static AddController getInstance() throws IOException {
        if (instance == null) {
            instance = new AddController();
        }
        return instance;
    }

    @Override
    public void flow() throws IOException {
        String author = getAuthor();
        String title = getTitle();
        bookRepository.add(new Book(Book.Status.FREE, author, title));
        MainMenuController.getInstance().flow();//------ co to , po co?
    }

    private String getAuthor() {
        System.out.println("Proszę podać autora książki:");
        String author = getInput().nextLine();/// ------- a gdzie tam jest scanner, że jest nextLine?/// -------
        if (checkIfEmpty(author)) {
            System.out.println("Proszę wpisać 1 znak");
            getAuthor();/// ---- czemu tutaj jest getAuthor?
        }
        return author;
    }

    private String getTitle() {
        System.out.println("Proszę podać tytuł książki:");
        String title = getInput().nextLine();
        if (checkIfEmpty(title)) {
            System.out.println("Proszę wpisać 1 znak");
            getTitle();
        }
        return title;
    }

    private boolean checkIfEmpty(String text) {
        return text.length() < 1;
    }
}
