package com.Microservices.Product.service.Repostry;

import com.Microservices.Product.service.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepostory extends JpaRepository<Product,Long> {

}
