package pe.lacafetalab.dddbase.domain.exception;

import pe.lacafetalab.dddbase.domain.code.AppCode;

public class NotFoundException extends AppException {

    private static final int STATUS_CODE = 404;

    public NotFoundException(AppCode code) {
        super(STATUS_CODE, code, "");
    }

    public NotFoundException(AppCode code, String message) {
        super(STATUS_CODE, code, message);
    }



}