package pe.lacafetalab.dddbase.domain.types.implement;

import pe.lacafetalab.dddbase.domain.types.TypeString;

final public class TypeStringImp extends TypeString {
    TypeStringImp(String value) {
        super(value);
    }

    public static TypeStringImp create(String value) {
        return new TypeStringImp(value);
    }
}
