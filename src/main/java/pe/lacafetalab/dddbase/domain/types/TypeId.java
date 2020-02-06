package pe.lacafetalab.dddbase.domain.types;


import pe.lacafetalab.dddbase.domain.code.SharedCode;
import pe.lacafetalab.dddbase.domain.exception.BadRequestException;

public abstract class TypeId extends TypeUUID {

    public TypeId(String id) {
        super(id);
        if (isNull()) {
            throw new BadRequestException(SharedCode.create(2), "El id no puede ser nulo");
        }
    }
}
