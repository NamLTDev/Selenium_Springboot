package com.example.springselenium.visa;

import com.example.springselenium.SpringBaseTestNGTest;
import com.example.springselenium.entity.Customer;
import com.example.springselenium.page.visa.VisaRegistrationPage;
import com.example.springselenium.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerVisaTest extends SpringBaseTestNGTest {

    private static final Logger logger = LoggerFactory.getLogger(CustomerVisaTest.class);

    @Autowired
    private VisaRegistrationPage visaRegistrationPage;

    @Autowired
    private CustomerRepository customerRepository;


    //@Test(dataProvider = "getData")
    @Test
    public void visaTest(){
        List<Customer> customers = this.customerRepository.findByDobBetween(Date.valueOf("1995-01-01"),Date.valueOf("1999-01-01"))
               .stream()
               .limit(1)
               .collect(Collectors.toList());

        for(Customer c : customers){

            this.visaRegistrationPage.goTo();
            this.visaRegistrationPage.setNames(c.getFirstName(),c.getLastName());
            this.visaRegistrationPage.setCountryFromAndTo(c.getFromCountry(),c.getToCountry());
            this.visaRegistrationPage.setBirthDate(c.getDob().toLocalDate());
            this.visaRegistrationPage.setContactDetails(c.getEmail(),c.getPhone());
            this.visaRegistrationPage.setComments(c.getComments());
            this.visaRegistrationPage.submit();

            logger.info("Request confirmation number: " + this.visaRegistrationPage.getConfirmationNumber());
            logger.warn(this.visaRegistrationPage.getConfirmationNumber());
        }
    }

//    @DataProvider
    public Object[][] getData(ITestContext context){
        return this.customerRepository.findByDobBetween(
                        Date.valueOf("2000-01-01"),
                        Date.valueOf("2010-01-01")
                )
                .stream()
                .limit(3)
                .map(o -> new Customer[]{o})
                .toArray(Object[][]::new);
    }


}
