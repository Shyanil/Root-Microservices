package com.Microservices.Product.service.Service;

import com.Microservices.Product.service.Model.Product;
import com.Microservices.Product.service.Repostry.ProductRepostory;
import com.Microservices.Product.service.dto.ProductRequest;
import com.Microservices.Product.service.dto.ProductResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // its auto created this.id= id type Constructor on ProductRepository
@Slf4j // using this i can call any name or id etc inside middle oof "the {} name" = the shyanil name
public class ProductService {

    private final ProductRepostory productRepostory;
     public void call(ProductRequest productRequest){
         Product product= Product.builder()
                 .Name(productRequest.getName())
                 .Email(productRequest.getEmail())
                 .PhoneNumber(productRequest.getPhoneNumber())
                 .Address(productRequest.getAddress())
                 .DateOfBirth(productRequest.getDateOfBirth())
                 .Gender(productRequest.getGender())
                 .Username(productRequest.getUsername())
                 .Password(productRequest.getPassword())
                 .City(productRequest.getCity())
                 .Country(productRequest.getCountry())
                 .Occupation(productRequest.getOccupation())
                 .EducationLevel(productRequest.getEducationLevel())
                 .build();
         productRepostory.save(product);
         log.info("The Product is save. The Product No is {}  and Product buyer name is ",product.getId() +product.getName());

     }

    public List<ProductResponse> getAllProductsData() {
        ; List<Product> products=productRepostory.findAll();
        return products.stream().map(this :: mapToProductResponse).toList(); // method inside of class thats why using lamda

    }

    private ProductResponse mapToProductResponse(Product product) {
         return  ProductResponse.builder()
        .Id(product.getId())
        .Name(product.getName())
        .Email(product.getEmail())
                 .PhoneNumber(product.getPhoneNumber()).
                 Address(product.getAddress()).
                 EducationLevel(product.getEducationLevel()).
                 Occupation(product.getOccupation()).
                 Username(product.getUsername()).
                build(); // i have to call of the variable if i want see in postman
    }
}
