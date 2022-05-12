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

        //비밀번호 암호화
        String encodePassword = passwordEncoder.encode(rawPassword);

        assertAll(
            //평문 패스워드와 암호화 패스워드가 서로 다른게 맞는지 -> assertNotEquals()
            () -> assertNotEquals(rawPassword, encodePassword),
            // matches -> 두 문자열을 비교해주는 역할
            // matches로 두 암호를 비교했을데 값이 같은 패스워드라는걸 반환하는지 -> assertTrue
            () -> assertTrue(passwordEncoder.matches(rawPassword, encodePassword))
        );
    }
}
