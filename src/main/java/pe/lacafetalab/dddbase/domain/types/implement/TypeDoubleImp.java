package pe.lacafetalab.dddbase.domain.types.implement;

import pe.lacafetalab.dddbase.domain.types.TypeDouble;

final public class TypeDoubleImp extends TypeDouble {
    public TypeDoubleImp(Double value) {
        super(value);
    }

    public static TypeDoubleImp create(Double value) {
        return new TypeDoubleImp(value);
    }
}
