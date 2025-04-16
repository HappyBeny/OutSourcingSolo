package practice.outsourcingsingle.common.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse {

    private HttpStatus errorCode;
    private String message;

    private ErrorResponse(ErrorCode errorCode) {
        this.errorCode = errorCode.getStatus();
        this.message = errorCode.getMessage();
    }

    public ErrorResponse(ErrorCode errorCode, final String message) {
        this.message = message;
    }

    public static ErrorResponse of(ErrorCode errorCode) {
        return new ErrorResponse(errorCode);
    }

    public static ErrorResponse of(final ErrorCode errorCode, final String message) {
        return new ErrorResponse(errorCode, message);
    }
}
