package com.misa.core.domain.types

import com.misa.core.domain.exception.BadRequestException
import com.misa.core.domain.types.implement.TypeIdImp
import spock.lang.Specification

class TypeIdSpec extends Specification {
    void 'cretae value null'() {
        when:
            TypeIdImp.create(null)
        then:
            thrown BadRequestException
    }
}
