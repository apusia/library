package com.apusia.library.helper;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ProjectPath {
    private static final Path path = Paths.get(".").normalize().toAbsolutePath();

    private ProjectPath(){}

    static Path getRootPath(){
        return path;
    }

}
