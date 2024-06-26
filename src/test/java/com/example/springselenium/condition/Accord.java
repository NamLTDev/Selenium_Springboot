package com.example.springselenium.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("${car.speed} >= 70")
public class Accord implements Car{
    @Override
    public void run() {
        System.out.println("This is Accord");
    }
}
