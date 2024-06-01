package com.example.springselenium.flights;

import com.example.springselenium.SpringBaseTestNGTest;
import com.example.springselenium.page.flights.FlightPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightTest extends SpringBaseTestNGTest {

    @Autowired
    private FlightAppDetails appDetails;

    @Autowired
    private FlightPage flightPage;

    @Test
    public void flightTest(){
        this.flightPage.goTo(this.appDetails.getUrl());
        Assert.assertTrue(this.flightPage.isAt());
        Assert.assertEquals(this.flightPage.getLabels(),this.appDetails.getLabels());
    }


}
