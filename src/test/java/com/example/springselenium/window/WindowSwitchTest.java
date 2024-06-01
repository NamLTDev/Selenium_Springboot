package com.example.springselenium.window;

import com.example.springselenium.SpringBaseTestNGTest;
import com.example.springselenium.page.window.MainPage;
import com.example.springselenium.page.window.PageA;
import com.example.springselenium.page.window.PageB;
import com.example.springselenium.page.window.PageC;
import com.example.springselenium.service.WindowSwitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@TestPropertySource(properties = "browser=chrome")
public class WindowSwitchTest extends SpringBaseTestNGTest {

    @Autowired
    private MainPage mainPage;

    @Autowired
    private PageA pageA;

    @Autowired
    private PageB pageB;

    @Autowired
    private PageC pageC;

    @BeforeClass
    public void setup(){
        this.mainPage.goTo();
        this.mainPage.isAt();
        this.mainPage.launchAllWindows();
    }

    @Test(dataProvider = "getData")
    public void switchTest(int index){
        this.pageA.addToArea(index + "\n");
        this.pageB.addToArea((index*2) + "\n");
        this.pageC.addToArea((index*3) + "\n");
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] objects = new Object[][]{{1},{2},{3},{4},{5},{6}};
        return objects;
    }

}
