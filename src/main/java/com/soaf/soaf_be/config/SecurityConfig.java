package com.soaf.soaf_be.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // 비밀번호를 항상 해시로 암호화해서 검증할 것이기에 bcrypt 를 빈으로 등록
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {

        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // csrf disable
        // Cross-Site Request Forgery
        // 세션 방식에서 발생하는 공격 방어방식
        http
                .csrf((auth) -> auth.disable());
        //---------------------

        // 스프링시큐리티 기본 인증 방식 비활성화
        // 1. Form 로그인 방식 disable
        http
                .formLogin((auth) -> auth.disable());

        // 2. http basic 인증 방식 disable
        http
                .httpBasic((auth) -> auth.disable());
        //---------------------

        // 경로별 인가 작업
        // 로그인, 루트, 조인 에는 모든 권한 허용
        // admin 경로는 ADMIN 권한을 가진 사용자만 허용
        // 나머지는 모두 로그인을 해서 인증이 됐을 경우에만 허용
        http
                .authorizeHttpRequests((auth) -> auth
                        .requestMatchers("/login", "/", "/join").permitAll()
                        .requestMatchers("/admin").hasRole("ADMIN")
                        .anyRequest().authenticated());
        //---------------------

        // 세션 설정
        // jwt 에서는 세션을 항상 stateless 방식으로 관리함
        http
                .sessionManagement((session) -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        //---------------------

        return http.build();
    }
}