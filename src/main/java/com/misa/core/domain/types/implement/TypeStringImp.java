package com.misa.core.domain.types.implement;

import com.misa.core.domain.types.TypeString;

final public class TypeStringImp extends TypeString {
    TypeStringImp(String value) {
        super(value);
    }

    public static TypeStringImp create(String value) {
        return new TypeStringImp(value);
    }
}
