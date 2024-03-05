package com.Microservices.Product.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
// in this i can receive the product information
// what i do to this is in already in Product because we doing microservices
// thats why we create extra extra class and call the data ato work more better
@Data // means getter and setter
@Builder // to createBuilder methord
//reduce boilerplate code in Java classes, particularly for data objects.
@NoArgsConstructor //Default constructor generation. // here data dont define in class () mens p sc= new p()
@AllArgsConstructor //Constructor with all fields generation. //// here data  define in class () mens p sc= new p(30,"shyanil",70)
public class ProductRequest {
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
