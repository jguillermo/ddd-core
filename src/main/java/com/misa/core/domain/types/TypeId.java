package com.misa.core.domain.types;


import com.misa.core.domain.code.SharedCode;
import com.misa.core.domain.exception.BadRequestException;

public abstract class TypeId extends TypeUUID {

    public TypeId(String id) {
        super(id);
        if (isNull()) {
            throw new BadRequestException(SharedCode.create(2), "El id no puede ser nulo");
        }
    }
}
