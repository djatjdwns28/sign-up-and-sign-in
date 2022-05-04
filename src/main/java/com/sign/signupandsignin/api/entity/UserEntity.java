package com.sign.signupandsignin.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private Long id;

    private String userId;

    private String password;

    private String age;

    private String sex;

    private String phoneNumber;

    private String address;
}
