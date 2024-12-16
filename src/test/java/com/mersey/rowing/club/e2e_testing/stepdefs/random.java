package com.mersey.rowing.club.e2e_testing.stepdefs;

import com.mersey.rowing.club.e2e_testing.config.DriverManager;
import com.mersey.rowing.club.e2e_testing.config.WebActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class random {
    WebDriver driver = DriverManager.getDriver();
    WebActions actions = new WebActions(driver);

    @Given("a correct username and password is entered")
    public void aCorrectUsernameAndPasswordIsEntered() {
        driver.get("http://localhost:8082");
        System.out.println("Current url: " + driver.getCurrentUrl());
        actions.populateField("username", "testUser");
        actions.populateField("password", "1234");
        actions.clickOnButtonByPath("/html/body/main/div/form/button");
    }

    @Then("user is taken to the homepage")
    public void userIsTakenToTheHomepage() {
        String expectedUrl = "http://localhost:8082/home";
        String actualUrl = driver.getCurrentUrl();
        if (!actualUrl.equals(expectedUrl)) {
            throw new AssertionError("Url mismatch: Expected " + expectedUrl + " but got " + actualUrl);
        }
    }
//    @Given("a correct username and password is entered")
//    public void aCorrectUsernameAndPasswordIsEntered() {
//        System.out.println("Entering usernmae and password");
//    }
//    @Then("user is taken to the homepage")
//    public void userIsTakenToTheHomepage() {
//        System.out.println("User has reached the homepage");
//    }
}
