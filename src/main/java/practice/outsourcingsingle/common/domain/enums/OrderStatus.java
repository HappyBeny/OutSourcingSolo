package practice.outsourcingsingle.common.domain.enums;

import practice.outsourcingsingle.common.exception.ErrorCode;
import practice.outsourcingsingle.common.exception.base.NotFoundException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum OrderStatus {
    ORDERED("user"),                // 손님이 주문 생성
    CONFIRMED("owner"),             // 가게에서 주문 확인
    PREPARING("owner"),             // 가게에서 준비 중
    OUT_FOR_DELIVERY("owner"),      // 가게에서 배달 시작
    COMPLETED("user"),              // 손님이 배달 완료 확인
    CANCELLED("user"),              // 손님이 주문 취소
    FAILED("owner");                // 가게에서 실패 처리

    private final String actor;

    OrderStatus(String actor) {
        this.actor = actor;
    }

    public static OrderStatus of(String orderStatus) {
        return Arrays.stream(OrderStatus.values())
                .filter(r -> r.name().equalsIgnoreCase(orderStatus))
                .findFirst()
                .orElseThrow(() -> new NotFoundException(ErrorCode.ORDER_STATUS_NOT_FOUND));
    }

    public static List<OrderStatus> getStatusesByActor(String actor) {
        return Arrays.stream(OrderStatus.values())
                .filter(status -> status.getActor().equalsIgnoreCase(actor))
                .collect(Collectors.toList());
    }

    public String getActor() {
        return actor;
    }
}
