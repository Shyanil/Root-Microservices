package com.example.InventoryService;

import com.example.InventoryService.Model.Inventory;
import com.example.InventoryService.Reposetory.InvertoryRepostory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
  //Load Data Inside Of DataBase
	@Bean
	public CommandLineRunner loadData(InvertoryRepostory invertoryRepostory){
		// now add lambda
		 return  args -> {
			 Inventory inventory=new Inventory();
			 inventory.setSkuCode("Android-sd-8");
			 inventory.setQuntities("300");


			 // and save the data in database
			 invertoryRepostory.save(inventory);
		 };
	}
}
