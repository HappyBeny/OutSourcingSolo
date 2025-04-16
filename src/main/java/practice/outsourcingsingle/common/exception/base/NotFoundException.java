package practice.outsourcingsingle.common.exception.base;

import practice.outsourcingsingle.common.exception.ErrorCode;

public class NotFoundException extends BusinessException{

    public NotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}
