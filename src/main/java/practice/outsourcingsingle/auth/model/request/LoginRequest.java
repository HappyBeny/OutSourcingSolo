package practice.outsourcingsingle.auth.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginRequest (

        @NotBlank(message = "이메일은 필수 입력값입니다.")
        @Email
        String email,

        @NotBlank(message = "비밀번호를 입력하세요.")
        String password
){
}
