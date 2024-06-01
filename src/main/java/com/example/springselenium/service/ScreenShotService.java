package com.example.springselenium.service;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
@Lazy
@Service
public class ScreenShotService {

    @Autowired
    private TakesScreenshot driver;

    @Autowired
    private ApplicationContext ctx;

    @Autowired
    private JavascriptExecutor javascriptExecutor;

    @Value("${screenshot.path}")
    private Path path;

    public void takeScreenShot(String imgName) throws IOException {
//        File sourceFile = this.driver.getScreenshotAs(OutputType.FILE);
//        FileCopyUtils.copy(sourceFile,this.path.resolve(imgName).toFile());
        File sourceFile = this.ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourceFile,this.path.resolve(imgName).toFile());
    }

    public byte[] getScreenShot(){
        return this.ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.BYTES);
    }

//    public byte[] screenShot(){
//        return this.ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.BYTES);
//    }
}
