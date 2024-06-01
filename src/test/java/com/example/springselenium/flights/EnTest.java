package com.example.springselenium.flights;

import org.springframework.test.context.TestPropertySource;

@TestPropertySource(properties = {"app.locale=en","browser=firefox"})
public class EnTest extends FlightTest{



}
