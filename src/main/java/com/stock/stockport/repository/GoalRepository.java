package com.stock.stockport.repository;

import com.stock.stockport.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, Long> {
    // 추가적인 쿼리 메서드 정의 가능
}
