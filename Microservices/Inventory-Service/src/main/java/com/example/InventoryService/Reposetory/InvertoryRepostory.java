package com.example.InventoryService.Reposetory;

import com.example.InventoryService.Model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvertoryRepostory extends JpaRepository<Inventory,Long> {
    Optional<Inventory> findBySkuCode(String skuCode); // i must have to define skuCode in side function
}
