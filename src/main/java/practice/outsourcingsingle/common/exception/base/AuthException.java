package practice.outsourcingsingle.common.exception.base;

import practice.outsourcingsingle.common.exception.ErrorCode;

public class AuthException extends BusinessException{

    public AuthException(ErrorCode errorCode) {
        super(errorCode);
    }
}
