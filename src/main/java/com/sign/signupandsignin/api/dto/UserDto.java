package com.sign.signupandsignin.api.dto;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private Long id;

    @ApiModelProperty(example = "유저 아이디")
    private String userId;
    
    @ApiModelProperty(example = "유저 비밀번호")
    private String password;

    @ApiModelProperty(example = "유저 나이")
    private String age;

    @ApiModelProperty(example = "성별")
    private String sex;

    @ApiModelProperty(example = "휴대폰 번호")
    private String phoneNumber;

    @ApiModelProperty(example = "주소")
    private String address;
}
