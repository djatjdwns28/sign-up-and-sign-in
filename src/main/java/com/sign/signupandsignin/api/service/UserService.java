package com.sign.signupandsignin.api.service;

import com.sign.signupandsignin.api.dto.UserDto;
import com.sign.signupandsignin.api.entity.UserEntity;
import com.sign.signupandsignin.api.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    
    @Autowired
    private UserMapper userMapper;

    @Transactional
    public Integer createUser(
        UserDto userDto
    ) {
        UserEntity userEntity = UserEntity.builder()
            .userId(userDto.getUserId())
            .password(userDto.getPassword())
            .age(userDto.getAge())
            .sex(userDto.getSex())
            .phoneNum(userDto.getPhoneNum())
            .address(userDto.getAddress())
            .build();
        return userMapper.createUser(userEntity);
    }
}
