package com.stepdefinition;

import com.Pages.TFL_page;
import com.Utils.Basepage;
import com.openDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static com.openDriver.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by ravi on 7/30/2017.
 */
public class Tfl_sd extends Basepage {
    public TFL_page tflPage = PageFactory.initElements(driver,TFL_page.class);

    @When("^i enter \"([^\"]*)\" as source$")
    public void iEnterAsSource(String From)  {

        tflPage.enterfromfield(From);
    }

    @And("^i enter \"([^\"]*)\" as destination$")
    public void iEnterAsDestination(String To)  {
        tflPage.entertofield(To);
    }

    @And("^i click on plan my journey button$")
    public void iClickOnPlanMyJourneyButton()  {
        tflPage.planmyjourney();
    }

    @Then("^i should see \"([^\"]*)\"$")
    public void iShouldSeejourneyresults()  {
      tflPage.journeyresults();

    }


    @And("^I should see \"([^\"]*)\" in From field$")
    public void iShouldSeeInFromField(String Expected)  {
        String Actual =driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[1]/div[1]/div[1]/strong")).getText();
        assertEquals(Expected,Actual);

    }

    @And("^I should see \"([^\"]*)\" in To field$")
    public void iShouldSeeInToField(String Expected)  {
        String Actual = driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[1]/div[1]/div[2]/strong")).getText();
    }

    @And("^I should see \"([^\"]*)\" hyperlink$")
    public void iShouldSeeHyperlink(String expHyperlink) {
        String Act = driver.findElement(By.linkText(expHyperlink)).getText();
        assertEquals(expHyperlink, Act);

        System.out.println(Act);

    }


    @And("^i should see \"([^\"]*)\" in URL$")
    public void iShouldSeeInURL(String ExpURL)  {
        String ActURL = driver.getCurrentUrl();
        assertTrue(ActURL.contains(ExpURL));
    }

    @And("^I should see \"([^\"]*)\"$")
    public void iShouldSeehyperlink(String Exp)  {
        String Act = driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[3]/div[2]/div/div")).getText();
        assertEquals(Exp,Act);
    }

    @Given("^I enter url$")
    public void iEnterUrl()   {
        openURL();


    }
}
