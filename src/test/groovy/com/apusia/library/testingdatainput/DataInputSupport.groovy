package com.apusia.library.testingdatainput

import com.apusia.library.input.DataInputContext

trait DataInputSupport {
    static final TestingDataInput testDataInput = new TestingDataInput()
    static {
        DataInputContext.register(testDataInput)
    }
    
}