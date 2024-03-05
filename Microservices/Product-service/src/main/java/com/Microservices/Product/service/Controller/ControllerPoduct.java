package com.Microservices.Product.service.Controller;

import com.Microservices.Product.service.Service.ProductService;
import com.Microservices.Product.service.dto.ProductRequest;
import com.Microservices.Product.service.dto.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/control") // @RequestMapping annotation is used at the class level to specify the base path for all the endpoint mappings within the
@RequiredArgsConstructor
public class ControllerPoduct {
    private  final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void Control(@RequestBody ProductRequest productRequest) {
        productService.call(productRequest);  // call basically objet name here i save data in Service class
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProductsData();
    }



}

