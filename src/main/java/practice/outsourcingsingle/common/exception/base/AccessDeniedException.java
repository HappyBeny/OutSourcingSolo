package practice.outsourcingsingle.common.exception.base;

import practice.outsourcingsingle.common.exception.ErrorCode;

public class AccessDeniedException extends BusinessException {

    public AccessDeniedException(ErrorCode errorCode) {
        super(errorCode);
    }
}
