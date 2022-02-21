package com.apusia.library.helper;

import java.io.FileWriter;
import java.io.IOException;

public enum Storage {
    BOOKS("books.txt");

    final StorageFile storageFile;

    Storage(String filename) {
        this.storageFile = new StorageFile(filename);
    }

    public FileWriter getFileWriter() throws IOException {
        return this.storageFile.getFileWriter();
    }

    class StorageFile{
        private String filename;

        StorageFile(String filename){
            this.filename = filename;
        }

        public FileWriter getFileWriter() throws IOException {
            String filePath = ProjectPath.getRootPath() + "/storage/" + filename;
            return new FileWriter(filePath, true);
        }
    }

}