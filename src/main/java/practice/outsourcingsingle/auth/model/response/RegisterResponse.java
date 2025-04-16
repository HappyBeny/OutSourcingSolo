package practice.outsourcingsingle.auth.model.response;

import practice.outsourcingsingle.common.domain.enums.UserRole;

public record RegisterResponse(
        Long id,
        String name,
        UserRole userRole
) {
}
