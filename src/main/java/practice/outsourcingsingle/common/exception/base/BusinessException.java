package practice.outsourcingsingle.common.exception.base;

import lombok.Getter;
import practice.outsourcingsingle.common.exception.ErrorCode;

@Getter
public class BusinessException extends RuntimeException {

    private final ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
