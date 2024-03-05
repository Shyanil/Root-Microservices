package com.example.InventoryService.Controller;

import com.example.InventoryService.Reposetory.InvertoryRepostory;
import com.example.InventoryService.Serviece.InvertoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/inventory")
@RequiredArgsConstructor
public class controlller {



    private final InvertoryService invertoryService;
    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isCllInventoty(@PathVariable("sku-code") String skuCode){
      return  invertoryService.isCllInventoty(skuCode);
    }

}
