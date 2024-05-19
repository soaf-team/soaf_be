package com.soaf.soaf_be.repository;

import com.soaf.soaf_be.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// <엔티티클래스, id값의타입>
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // existsBy... db 에 존재 여부를 체크해주는 Jpa 메서드
    Boolean existsByUsername(String username);

}