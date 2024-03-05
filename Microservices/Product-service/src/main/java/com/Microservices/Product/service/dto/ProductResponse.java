package com.Microservices.Product.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// I can directly call the data in Model class but for Good practice i have to do Model class and dto class different
//what i do to this is in already in Product because we doing microservices
// thats why we create extra extra class and call the data ato work more better
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {

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
