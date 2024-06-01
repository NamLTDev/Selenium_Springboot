package com.example.springselenium.config;

import com.example.springselenium.annotation.LazyConfiguration;
import com.example.springselenium.annotation.ThreadScopeBean;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

import java.io.File;
import java.time.Duration;

@LazyConfiguration
//@Profile("!remote")
public class WebDriverConfig {


    @Value("${pathToFireFoxDriver}")
    private String pathToFireFoxDriver;

    @ThreadScopeBean
    @ConditionalOnMissingBean
    public WebDriver chromeDriver(){
        return new ChromeDriver();
    }

    @ThreadScopeBean
    @Primary
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver firefoxDriver(){
//        System.setProperty("webdriver.gecko.driver","D:\\DownloadStuff\\geckodriver.exe");
//        File pathBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//        FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
//        FirefoxProfile firefoxProfile = new FirefoxProfile();
//        WebDriver driver = new FirefoxDriver(firefoxBinary,firefoxProfile);
        return new FirefoxDriver();

    }

}
