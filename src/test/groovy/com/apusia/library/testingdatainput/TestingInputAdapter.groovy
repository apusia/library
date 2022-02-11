package com.apusia.library.testingdatainput

import com.apusia.library.input.InputAdapter

class TestingInputAdapter implements InputAdapter {
    // FIFO
    private final LinkedList<String> data = new LinkedList<>()
    
    TestingInputAdapter() {
    }
    
    void addData(String... data) {
        def stringArray = data
        def stringArrayList = Arrays.asList(stringArray)
        this.data.addAll(stringArrayList)
    }
    
    @Override
    String nextLine() {
        def poped = data.pop()
        System.out.println(poped)
        return poped
    }
    
}
