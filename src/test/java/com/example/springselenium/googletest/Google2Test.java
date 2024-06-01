package com.example.springselenium.googletest;

import com.example.springselenium.SpringBaseTestNGTest;
import com.example.springselenium.annotation.LazyAutowired;
import com.example.springselenium.page.google.GooglePage;
import com.example.springselenium.service.ScreenShotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Google2Test extends SpringBaseTestNGTest {

    @LazyAutowired
    private GooglePage googlePage;

    @Lazy
    @LazyAutowired
    private ScreenShotService screenShotService;

    @Test
    public void googleTest() throws InterruptedException, IOException {
        this.googlePage.goTo();
        this.googlePage.getSearchComponent().search("selenium ");
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.screenShotService.takeScreenShot("test2.png");
        this.googlePage.close();
    }
}
