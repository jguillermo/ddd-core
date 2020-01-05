package com.misa.core.domain.types.implement;

import com.misa.core.domain.types.TypeDouble;

final public class TypeDoubleImp extends TypeDouble {
    public TypeDoubleImp(Double value) {
        super(value);
    }

    public static TypeDoubleImp create(Double value) {
        return new TypeDoubleImp(value);
    }
}
