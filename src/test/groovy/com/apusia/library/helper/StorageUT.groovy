package com.apusia.library.helper

import spock.lang.Specification

class StorageUT extends Specification{

    def "get books path"(){
        expect:
            Storage.BOOKS.getFileWriter()
    }
}
