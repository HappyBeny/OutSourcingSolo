package practice.outsourcingsingle.auth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practice.outsourcingsingle.auth.repository.UserRepository;
import practice.outsourcingsingle.common.config.PasswordEncoder;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

}
