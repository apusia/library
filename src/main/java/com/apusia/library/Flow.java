package com.apusia.library;

import java.io.IOException;

@FunctionalInterface
public interface Flow {
    void flow() throws IOException;
}
