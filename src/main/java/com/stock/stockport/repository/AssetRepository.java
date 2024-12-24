package com.stock.stockport.repository;

import com.stock.stockport.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Long> {
    // 추가적인 쿼리 메서드 정의 가능
}
