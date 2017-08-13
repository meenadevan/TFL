package com.Pages;

import com.Utils.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.openDriver.driver;

/**
 * Created by ravi on 8/6/2017.
 */
public class TFL_page extends Basepage {

@FindBy(id="InputFrom")
private WebElement inputfrom;

    public void enterfromfield(String source) {
        waitforElement(inputfrom);
        inputfrom.sendKeys(source);
    }
  @FindBy(id="InputTo")
  private WebElement inputto;
  public void entertofield(String destination) {

      inputto.sendKeys(destination);
    }

   @FindBy(xpath =".//*[@id='plan-a-journey']/fieldset/input" )
   private WebElement planmyjourney;
    public void planmyjourney() {
        planmyjourney.click();

            }

    public void journeyresults() {
        driver.findElement(By.xpath(".//*[@id='full-width-content']/div/div[2]/div/h1/span")).getText();
    }


}
