package com.example.InventoryService.Serviece;

import com.example.InventoryService.Reposetory.InvertoryRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InvertoryService {

    private final InvertoryRepostory invertoryRepostory;
    @Transactional(readOnly = true)  // its Transacted from Order Service
    public boolean isCllInventoty(String skuCode){
        // i must have to define skuCode in side function
        return  invertoryRepostory.findBySkuCode(skuCode).isPresent();
    }
}
