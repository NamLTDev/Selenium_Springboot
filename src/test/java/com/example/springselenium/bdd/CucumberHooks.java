package com.example.springselenium.bdd;

import com.example.springselenium.annotation.LazyAutowired;
import com.example.springselenium.service.ScreenShotService;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;

public class CucumberHooks {

    @LazyAutowired
    private ScreenShotService service;

    @LazyAutowired
    private ApplicationContext applicationContext;

    @LazyAutowired
    private TakesScreenshot driver;

//    @AfterStep
//    public void afterStep(Scenario scenario){
//        if(scenario.isFailed()){
//            scenario.embed(this.service.getScreenShot(), "image/png", scenario.getName());
//        }
//    }

    @AfterStep
    public void afterStep(Scenario scenario){
        if(scenario.isFailed()){
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),
                    "image/png","SHEIN");
        }
    }

    @After
    public void afterScenario(){
        this.applicationContext.getBean(WebDriver.class).quit();
    }

}
