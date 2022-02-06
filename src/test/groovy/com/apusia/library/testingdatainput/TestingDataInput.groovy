package com.apusia.library.testingdatainput

import com.apusia.library.input.DataInput

class TestingDataInput implements DataInput {
    private final LinkedList<String> data = new LinkedList<>()
    
    TestingDataInput() {
    }
    
    void addData(String... data) {
        this.data.addAll(Arrays.asList(data))
    }
    
    @Override
    String nextLine() {
        def poped = data.pop()
        System.out.println(poped)
        return poped
    }
    
}
