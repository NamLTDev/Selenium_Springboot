package com.example.springselenium.page.flights;

import com.example.springselenium.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FlightPage extends Base {

    @FindBy(css = "nav.rlGvde a")
    private List<WebElement> elements;

    public void goTo(final String url){
        this.driver.get(url);
        this.driver.manage().window().maximize();
    }

    public List<String> getLabels(){
        return this.elements.stream()
                .map(e->e.getText())
                .map(String::trim)
                .collect(Collectors.toList());
    }


    @Override
    public boolean isAt() {
        return wait.until((d) -> !this.elements.isEmpty());
    }
}
