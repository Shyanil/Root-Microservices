package com.example.Order_Service.Repostory;

import com.example.Order_Service.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepostory extends JpaRepository<Order,Long> {
}
