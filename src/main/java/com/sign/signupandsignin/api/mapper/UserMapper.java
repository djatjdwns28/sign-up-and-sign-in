package com.sign.signupandsignin.api.mapper;

import com.sign.signupandsignin.api.entity.UserEntity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    public Integer createUser(
        @Param("userEntity") UserEntity userEntity
    );
}
