package com.sign.signupandsignin.api.controller;

import com.sign.signupandsignin.api.dto.UserDto;
import com.sign.signupandsignin.api.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")
public class ApiUserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String getUser() {
        return "dd";
    }

    @PostMapping("/createUser")
    public Integer createUser(
        @RequestBody UserDto userDto
    ) {
        return userService.createUser(userDto);
    }
}
