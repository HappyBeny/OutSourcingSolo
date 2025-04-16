package practice.outsourcingsingle.common.exception.base;

import practice.outsourcingsingle.common.exception.ErrorCode;

public class InvalidRequestException extends BusinessException {

    public InvalidRequestException(ErrorCode errorCode) {
        super(errorCode);
    }
}
