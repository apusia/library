package com.apusia.library;

import java.io.File;
import java.io.IOException;

public class StorageHelper {
    private static final String STORAGE_PATH = "/Users/paulinaniedzialek/Desktop/Projekty IDEA/library/storage/";

    private static File getFile(String fileName) {
        File file = new File(STORAGE_PATH + fileName);
        if (ifNotExists(file)) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    private static boolean ifNotExists(File file) {
        return !file.exists();
    }

    public static File getBooksFile() {
        return getFile("books.txt");
    }

}