package com.stock.stockport.controller;

import com.stock.stockport.model.Portfolio;
import com.stock.stockport.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioRepository portfolioRepository;

    @GetMapping
    public String getAllPortfolios(Model model) {
        model.addAttribute("portfolios", portfolioRepository.findAll());
        return "portfolio-list"; // 포트폴리오 목록을 보여주는 Thymeleaf 템플릿 파일명 (예: portfolio-list.html)
    }
}
