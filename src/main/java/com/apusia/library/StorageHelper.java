package com.apusia.library;

import java.io.FileWriter;
import java.io.IOException;

public class StorageHelper {
    private static final String STORAGE_PATH = "/Volumes/Dane/Projekty/library/storage/";

    public FileWriter getFile(Storage storage) throws IOException {
        return new FileWriter(STORAGE_PATH + storage.filename, true);
    }

    public enum Storage {
        BOOKS("books.txt");

        final String filename;

        Storage(String filename) {
            this.filename = filename;
        }
    }

}