package com.apusia.library.menumain;

public class MenuMainView {
    private static MenuMainView instance = new MenuMainView();

    private MenuMainView() {
    }

    static MenuMainView getInstance(){
        return MenuMainView.instance;
    }

    public void print(){
        System.out.println("Wybierz operację, którą chcesz wykonać");
        System.out.println("1 Przejrzyj listę książek");
        System.out.println("2 Dodaj książkę");
        System.out.println("3 Usuń książkę");
        System.out.println("q Wyjdź z programu");
    }

}
