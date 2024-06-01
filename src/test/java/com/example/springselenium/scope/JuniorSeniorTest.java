package com.example.springselenium.scope;

import com.example.springselenium.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class JuniorSeniorTest extends SpringBaseTestNGTest {

    @Autowired
    private JuniorEng juniorEng;

    @Autowired
    private SeniorEng seniorEng;

    @Test
    public void scopeTest(){
        this.juniorEng.setAmount(100);
        System.out.println("Junior: " + this.juniorEng.getSalary().getAmount());
        this.seniorEng.setAmount(200);
        System.out.println("Senior: " + this.seniorEng.getSalary().getAmount());
        System.out.println("Junior: " + this.juniorEng.getSalary().getAmount());
    }
}
