package com.example.Order_Service.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name="Order_Data_List")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this will be auto increment   primary key
    private Long Id;
    private String SkuCode;
    private BigDecimal price;
    private Integer Quantity;
}
