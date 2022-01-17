package com.apusia.library.main;

public class MainView {
    private static MainView instance = new MainView();

    private MainView() {
    }

    static MainView getInstance(){
        return MainView.instance;
    }

    public void print(){
        System.out.println("Wybierz operację, którą chcesz wykonać");
        System.out.println("1 Przejrzyj listę książek");
        System.out.println("2 Dodaj książkę");
        System.out.println("3 Usuń książkę");
        System.out.println("q Wyjdź z programu");
    }

}
