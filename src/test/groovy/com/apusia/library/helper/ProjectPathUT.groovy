package com.apusia.library.helper

import spock.lang.Specification

class ProjectPathUT extends Specification{

    def "get project path"(){
        expect:
            ProjectPath.getRootPath()
    }
}
