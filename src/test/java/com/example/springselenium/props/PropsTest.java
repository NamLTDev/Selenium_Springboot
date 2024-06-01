package com.example.springselenium.props;

import com.example.springselenium.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class PropsTest extends SpringBaseTestNGTest {

    @Autowired
    private ResourceLoader loader;

    @Test
    public void propTest() throws IOException {

        Properties properties = PropertiesLoaderUtils.loadProperties(loader.getResource("classpath:my.properties"));
        System.out.println(properties);
    }
}
