package practice.outsourcingsingle.common.domain.enums;

import lombok.Getter;
import practice.outsourcingsingle.common.exception.ErrorCode;

import java.util.Arrays;

@Getter
public enum UserRole {

    OWNER("owner"),
    USER("user");

    private final String userRole;

    UserRole(String userRole) {
        this.userRole = userRole;
    }

    public static UserRole of(String userRole) {

        return Arrays.stream(UserRole.values()).filter(r -> r.name()
                .equalsIgnoreCase(userRole)).findFirst()
                .orElseThrow(() -> new InvalidRequestException(ErrorCode.INVALID_REQUEST));
    }
}
