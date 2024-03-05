package com.example.Order_Service.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="Order_Data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Long Id;
    private  String Name;
    private  String OrderNumber;
    private  Long Date;
    @OneToMany(cascade = CascadeType.ALL) // we attach the DataList class
    private List<DataList> dataList; // here

}
