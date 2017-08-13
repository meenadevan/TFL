package com.stepdefinition;

import com.Utils.Basepage;
import com.openDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static com.openDriver.driver;


public class Registration_sd extends Basepage {




    @And("^I enter email address is \"([^\"]*)\"$")
    public void iEnterEmailAddressIs(String email) {
        driver.findElement(By.id("EmailAddress")).sendKeys(email);

    }

    @And("^I enter confirm email address is \"([^\"]*)\"$")
    public void iEnterConfirmEmailAddressIs(String confirmemail) {
        driver.findElement(By.id("EmailAddressCheck")).sendKeys(confirmemail);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmpassword) {
        driver.findElement(By.id("PasswordCheck")).sendKeys(confirmpassword);
    }



}
