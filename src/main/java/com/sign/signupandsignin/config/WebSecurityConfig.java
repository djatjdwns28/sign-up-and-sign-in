package com.sign.signupandsignin.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configurable
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    //PasswordEncoder -> 비밀번호 암호화 하는 역ㅏ
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        //BCcrypt라는 해시함수를 이용하여 패스워드를 암호화하는 구현체이다.
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().disable()
            .csrf().disable()
            .formLogin().disable()
            .headers().frameOptions().disable();
    }
}
