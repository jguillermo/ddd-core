package com.misa.core.domain.types;


import com.misa.core.domain.code.SharedCode;
import com.misa.core.domain.exception.BadRequestException;

import java.util.UUID;

public abstract class TypeUUID extends TypeString {

    public TypeUUID(String uuid) {
        super(uuid);
        isValidate();
    }

    private void isValidate() {
        if (isNull()) {
            return;
        }
        try {
            UUID.fromString(value());
        } catch (IllegalArgumentException exception) {
            throw new BadRequestException(SharedCode.create(1), "Uuid value no valid");
        }

    }
}
