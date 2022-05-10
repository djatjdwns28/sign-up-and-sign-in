package com.sign.signupandsignin;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class PasswordTest {
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    @DisplayName("패스워드 암호화")
    void passwordEncode(){
        String rawPassword = "dhdhdh123";

        String encodePassword = passwordEncoder.encode(rawPassword);

        assertAll(
            () -> assertNotEquals(rawPassword, encodePassword),
            () -> assertTrue(passwordEncoder.matches(rawPassword, encodePassword))
        );
    }
}
