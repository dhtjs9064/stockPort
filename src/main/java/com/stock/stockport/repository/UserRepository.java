package com.stock.stockport.repository;

import com.stock.stockport.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // 추가적인 쿼리 메서드 정의 가능
}
