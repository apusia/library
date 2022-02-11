package com.apusia.library.mainmenu


import com.apusia.library.testingdatainput.DataInputSupport
import spock.lang.Specification

class MainMenuControllerUT extends Specification implements DataInputSupport {
//class MainMenuControllerUT extends Specification {
    
    def "check if we can go to AddController from MainMenuController"() {
        given:
//            def testInput = new TestingInputAdapter()
//            InputContext.register(testInput);

            testInput.addData("2", "King", "IT", "q")
        when:
            def flow = MainMenuController.getInstance(scannerInputAdapter).flow()
        then:
            flow.toString()
    }
    
//    def "qwe"() {
//        expect:
//            ScannerInputAdapter objectAdapter = new ScannerInputAdapter()
//            objectAdapter.kaszanka()
//
////            InputAdapter inputAdapter = (InputAdapter) objectAdapter
//            InputAdapter inputAdapter = objectAdapter
////            inputAdapter.nextLine()
////            inputAdapter.
//
//
//            true
//    }
}
