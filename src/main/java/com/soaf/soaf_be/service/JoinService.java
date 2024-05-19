package com.soaf.soaf_be.service;

import com.soaf.soaf_be.dto.JoinDTO;
import com.soaf.soaf_be.entity.UserEntity;
import com.soaf.soaf_be.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public JoinService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {

        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public void joinProcess(JoinDTO joinDTO) {
        // dto 에서 username, password 꺼내기
        String username = joinDTO.getUsername();
        String password = joinDTO.getPassword();

        // db에 username이 있는지 체크
        Boolean isExist = userRepository.existsByUsername(username);

        if (isExist) {

            return;
        }

        // 새 UserEntity 추가
        UserEntity data = new UserEntity();

        data.setUsername(username);
        // password 해싱하여 저장
        data.setPassword(bCryptPasswordEncoder.encode(password));
        data.setRole("ROLE_ADMIN");

        userRepository.save(data);
    }
}