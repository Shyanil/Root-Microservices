package com.Microservices.Product.service.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long Id;
    public String Name;
    public String Email;
    public String PhoneNumber;
    public String Address;
    public String DateOfBirth;
    public String Gender;
    public String Username;
    public String Password;
    public String City;
    public String Country;
    public String Occupation;
    public String EducationLevel;

}
