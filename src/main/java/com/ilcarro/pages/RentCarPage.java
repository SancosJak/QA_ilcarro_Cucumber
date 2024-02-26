package com.ilcarro.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RentCarPage extends BasePage{
    public RentCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='navigation-link' and @id='1']")
    WebElement rentCarLink;
    public RentCarPage clickOnLetTheCarWorkLink() {
        pause(2000);
        click(rentCarLink);
        return this;
    }
    public void enterCarData() {
        enterLocation("Tel Aviv, Israel");
        enterManufacture("Audi");
        enterModel("A7");
        enterYear("2024");
        enterFuel("Diesel");
        enterSeats("5");
        enterClass("Limousin");
        enterSerialNumber("DE-123457");
        enterPrice("750");
        enterAboutData("It`s a good new car!");
    }

    @FindBy(id = "pickUpPlace")
    WebElement location;

    public RentCarPage enterLocation(String city) {
        type(location, city);
        pause(1000);
        location.sendKeys(Keys.DOWN);
        location.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "make")
    WebElement manufactureField;

    public RentCarPage enterManufacture(String manufacture) {
        type(manufactureField, manufacture);
        return this;
    }

    @FindBy(id = "model")
    WebElement modelField;

    public RentCarPage enterModel(String model) {
        type(modelField, model);
        return this;
    }

    @FindBy(id = "year")
    WebElement yearField;

    public RentCarPage enterYear(String year) {
        type(yearField, year);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement fuelField;

    public RentCarPage enterFuel(String fuel) {
        click(fuelField);
        fuelField.sendKeys(fuel);
        fuelField.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "seats")
    WebElement seatsField;

    public RentCarPage enterSeats(String seats) {
        type(seatsField, seats);
        return this;
    }

    @FindBy(id = "class")
    WebElement classField;

    public RentCarPage enterClass(String classAuto) {
        type(classField, classAuto);
        return this;
    }

    @FindBy(id = "serialNumber")
    WebElement serialNumberField;

    public RentCarPage enterSerialNumber(String serialNumber) {
        type(serialNumberField, serialNumber);
        return this;
    }

    @FindBy(id = "price")
    WebElement priceField;

    public RentCarPage enterPrice(String price) {
        type(priceField, price);
        return this;
    }

    @FindBy(id = "about")
    WebElement aboutField;

    public RentCarPage enterAboutData(String aboutData) {
        type(aboutField, aboutData);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement submitButton;
    public RentCarPage submitCar() {
        click(submitButton);
        return this;
    }

    @FindBy(xpath = "//h1[.='Car added']")
    WebElement submitMessage;

    public RentCarPage submitMessageCarSuccessAdded(String message) {
        Assert.assertTrue(submitMessage.getText().contains(message));
        return this;
    }
}
