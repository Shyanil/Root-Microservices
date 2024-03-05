package com.example.Order_Service.Service;

import com.example.Order_Service.Dto.OrderRequest;
import com.example.Order_Service.Dto.OrderRequestLine;
import com.example.Order_Service.Model.DataList;
import com.example.Order_Service.Model.Order;
import com.example.Order_Service.Repostory.OrderRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepostory orderRepostory;
    public void OrderServiceData(OrderRequest orderRequest){
        Order order= new Order();
        order.setOrderNumber(UUID.randomUUID().toString()); /// this part is important if i have to do this is
        // if Order class OrderNumber is String then
        List<DataList> list = orderRequest.getOrderRequestLines() // here i call OrderRequestLine class from dto
                .stream()
                .map(this::mapTodtoOrder)     // spring booot lamda ::
                .toList();
        order.setDataList(list); // return the class  //and its save to database
        orderRepostory.save(order); // order save in my database
    }

    private DataList mapTodtoOrder(OrderRequestLine orderRequestLine) {
       DataList dataList= new DataList();
       dataList.setPrice(orderRequestLine.getPrice());
       dataList.setSkuCode(orderRequestLine.getSkuCode());
       dataList.setQuantity(orderRequestLine.getQuantity());
       dataList.setId(orderRequestLine.getId());
       return dataList;
    }
}
