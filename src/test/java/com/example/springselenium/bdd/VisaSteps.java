//package com.example.springselenium.bdd;
//
//import com.example.springselenium.annotation.LazyAutowired;
//import com.example.springselenium.page.visa.VisaRegistrationPage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest()
//public class VisaSteps {
//
//    @Autowired
//    private VisaRegistrationPage registrationPage;
//
//
//    @Given("I am on Visa registration form")
//    public void launchSite() {
//        this.registrationPage.goTo();
//    }
//
//    @When("I select my from country {string} and to country {string}")
//    public void iSelectMyFromCountryAndToCountry(String arg0, String arg1) {
//    }
//
//    @And("I enter my dob as {string}")
//    public void iEnterMyDobAs(String arg0) {
//    }
//
//    @And("I enter my name as {string} and {string}")
//    public void iEnterMyNameAsAnd(String arg0, String arg1) {
//    }
//
//    @And("I enter my contact details as {string} and {string}")
//    public void iEnterMyContactDetailsAsAnd(String arg0, String arg1) {
//    }
//
//    @And("I enter the comment {string}")
//    public void iEnterTheComment(String arg0) {
//    }
//
//    @And("I submit the form")
//    public void iSubmitTheForm() {
//    }
//
//    @Then("I should see get the confirmation number")
//    public void iShouldSeeGetTheConfirmationNumber() {
//    }
//}
