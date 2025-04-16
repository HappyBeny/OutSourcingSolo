package practice.outsourcingsingle.common.domain.enums;

import lombok.Getter;
import practice.outsourcingsingle.common.exception.ErrorCode;

import java.util.Arrays;

@Getter
public enum ReviewStar {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private final Integer value;

    ReviewStar(Integer value) {
        this.value = value;
    }

    public static ReviewStar of(Integer value) {
        return Arrays.stream(ReviewStar.values())
                .filter(r -> r.value.equals(value))
                .findFirst()
                .orElseThrow(() -> new InvalidRequestException(ErrorCode.INVALID_REQUEST));
    }
}
