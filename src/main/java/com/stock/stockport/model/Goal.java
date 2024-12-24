package com.stock.stockport.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double targetIncrease;
    private String targetDate;
    private Double currentProgress;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
