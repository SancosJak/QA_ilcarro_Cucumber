package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {
    @And("User clicks on the Login Link")
    public void click_On_Login_Link(){
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enter_valid_data(){
        new LoginPage(driver).enterData("neuer@gm.co","Neuer12345!");
    }
    @And("User clicks on Yalla Button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("User verifies Success message is displayed")
    public void verify_Success_message(){
        new LoginPage(driver).isSuccessMessageDisplayed();
    }
    @And("User enters valid email and wrong password")
    public void enter_valid_email_wrong_password(DataTable table){
        new LoginPage(driver).enterWrongData(table);
    }
    @And("User clicks OK button")
    public void click_OK_button() {
        new LoginPage(driver).clickOnOkButton();
    }

    @Then("User verifies Error message is displayed")
    public void verify_Error_message(){
        new LoginPage(driver).isErrorDisplayed();
    }
}
