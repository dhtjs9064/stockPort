package com.stock.stockport.repository;

import com.stock.stockport.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    // 추가적인 쿼리 메서드 정의 가능
}
