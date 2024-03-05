package com.example.Order_Service.Controller;

import com.example.Order_Service.Dto.OrderRequest;
import com.example.Order_Service.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @ResponseStatus(HttpStatus.CREATED)
   @PostMapping
    private  String OrderDetails(@RequestBody OrderRequest orderRequest){
       orderService.OrderServiceData(orderRequest);
       return "Order Successfully granted";
    }
}
