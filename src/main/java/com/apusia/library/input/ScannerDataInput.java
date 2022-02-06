package com.apusia.library.input;

import java.util.Scanner;

public class ScannerDataInput implements DataInput {
    private static final Scanner keyboard = new Scanner(System.in);

    @Override
    public String nextLine() {
        return keyboard.nextLine();
    }

}
