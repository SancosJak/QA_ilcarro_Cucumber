package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.LoginPage;
import com.ilcarro.pages.RentCarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class RentCarSteps {

    @And("User clicks on OK button")
    public void clickOK_button() {

        new LoginPage(driver).clickOnOkButton();
    }
    @And("User clicks on Let the car work link")
    public void clickRentCarLink() {
        new RentCarPage(driver).clickOnLetTheCarWorkLink();
    }

    @And("User enters valid data about car")
    public void enter_car_data() {
        new RentCarPage(driver).enterCarData();
    }

    @And("User clicks submit button")
    public void clickSubmitButton() {
        new RentCarPage(driver).submitCar();
    }

    @Then("User verifies message car was added")
    public void verify_message_that_a_car_was_added() {
        new RentCarPage(driver).submitMessageCarSuccessAdded("Car added");
    }
}
