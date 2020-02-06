package pe.lacafetalab.dddbase.domain.types;


import pe.lacafetalab.dddbase.domain.code.SharedCode;
import pe.lacafetalab.dddbase.domain.exception.BadRequestException;

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
