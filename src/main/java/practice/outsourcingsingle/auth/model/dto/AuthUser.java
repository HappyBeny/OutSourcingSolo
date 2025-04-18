package practice.outsourcingsingle.auth.model.dto;

import practice.outsourcingsingle.common.domain.enums.UserRole;
//인증 객체
public record AuthUser(
        Long id,
        String email,
        UserRole userRole
) {
}
