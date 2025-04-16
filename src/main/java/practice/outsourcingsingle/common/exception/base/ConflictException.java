package practice.outsourcingsingle.common.exception.base;

import practice.outsourcingsingle.common.exception.ErrorCode;

public class ConflictException extends BusinessException {

    public ConflictException(ErrorCode errorCode) {
        super(errorCode);
    }
}
