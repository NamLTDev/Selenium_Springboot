package com.example.springselenium;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.testng.annotations.AfterMethod;

@Lazy
@Component
public class Address {

//    private String street;

    @Autowired
    private Faker faker;

//    public Address(){
//        this.street = "123 My Dinh Street";
//    }

    @AfterMethod
    public String getStreet() {
        return this.faker.address().streetAddress();
    }
}
