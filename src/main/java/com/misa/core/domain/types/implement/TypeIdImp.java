package com.misa.core.domain.types.implement;

import com.misa.core.domain.types.TypeId;

public class TypeIdImp extends TypeId {
    public TypeIdImp(String id) {
        super(id);
    }

    public static TypeIdImp create(String id) {
        return new TypeIdImp(id);
    }
}
