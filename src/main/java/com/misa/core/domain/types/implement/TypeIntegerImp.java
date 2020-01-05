package com.misa.core.domain.types.implement;

import com.misa.core.domain.types.TypeInteger;

final public class TypeIntegerImp extends TypeInteger {
    TypeIntegerImp(Integer value) {
        super(value);
    }

    public static TypeIntegerImp create(Integer value) {
        return new TypeIntegerImp(value);
    }
}