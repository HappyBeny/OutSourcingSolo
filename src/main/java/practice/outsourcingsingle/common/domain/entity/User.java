package practice.outsourcingsingle.common.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import practice.outsourcingsingle.common.domain.enums.UserRole;

@Entity
@Table(name = "user")
@Getter
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    private String name;

    private String phoneNumber;

    private String address;

    private UserRole userRole;

    private boolean isDeleted = Boolean.FALSE;
}
