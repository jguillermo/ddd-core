package pe.lacafetalab.dddbase.domain.types.implement;

import pe.lacafetalab.dddbase.domain.types.TypeInteger;

final public class TypeIntegerImp extends TypeInteger {
    TypeIntegerImp(Integer value) {
        super(value);
    }

    public static TypeIntegerImp create(Integer value) {
        return new TypeIntegerImp(value);
    }
}