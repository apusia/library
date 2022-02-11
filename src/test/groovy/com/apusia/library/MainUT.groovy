package com.apusia.library

import com.apusia.library.testingdatainput.DataInputSupport
import spock.lang.Specification

class MainUT extends Specification implements DataInputSupport{
    
    def "Check if main runs MainMenuController flow"(){
        given:
            testInput.addData("q")
        when:
            Main.main()
        then:
            true
    }
    
}
