package com.misa.core.domain.types

import com.misa.core.domain.exception.BadRequestException
import com.misa.core.domain.types.implement.TypeIdImp
import spock.lang.Specification

class TypeIdSpec extends Specification {
    void 'create type ok'(){
        when:
            def typeId=TypeIdImp.create('0134dfc1-3015-4a22-8049-6c297164f13a')
        then:
            typeId.toString()=='0134dfc1-3015-4a22-8049-6c297164f13a'
    }

    void 'cretae value null'() {
        when:
            TypeIdImp.create(null)
        then:
            thrown BadRequestException
    }
}
