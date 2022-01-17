package com.apusia.library.menumain;

import java.util.Scanner;

public class MenuMainController {
    private static MenuMainController instance = new MenuMainController();
    private MenuMainView view = MenuMainView.getInstance();

    private MenuMainController(){}

    public static MenuMainController getInstance(){
        return MenuMainController.instance;
    }

    public void flow(){
        view.print();

        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();

        input.toString();
    }

}
