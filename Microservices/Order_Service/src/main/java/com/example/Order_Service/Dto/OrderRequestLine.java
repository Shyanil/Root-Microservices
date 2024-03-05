package com.example.Order_Service.Dto;

import jakarta.persistence.Entity;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestLine {
    private Long Id;
    private String SkuCode;
    private BigDecimal price;
    private int Quantity;


}

