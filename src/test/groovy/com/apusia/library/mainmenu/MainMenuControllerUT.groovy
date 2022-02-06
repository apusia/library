package com.apusia.library.mainmenu

import com.apusia.library.input.DataInputContext
import com.apusia.library.testingdatainput.DataInputSupport
import com.apusia.library.testingdatainput.TestingDataInput
import spock.lang.Specification

class MainMenuControllerUT extends Specification implements DataInputSupport{
        
        def "check if we can go to AddController from MainMenuController"() {
                given:
//                    def testDataInput = new TestingDataInput()
//                    DataInputContext.register(testDataInput);
    
                    testDataInput.addData("2", "King", "IT","q")
                when:
                    def flow = MainMenuController.getInstance().flow()
                then:
                    flow.toString()
        }
}
