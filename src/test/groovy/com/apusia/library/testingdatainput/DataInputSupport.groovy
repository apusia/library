package com.apusia.library.testingdatainput

import com.apusia.library.input.InputContext

trait DataInputSupport {
    static final TestingInputAdapter testInput = new TestingInputAdapter()
    static {
        InputContext.register(testInput)
    }
}
