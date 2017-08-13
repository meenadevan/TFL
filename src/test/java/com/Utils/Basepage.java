package com.Utils;

import com.openDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.openDriver.driver;


/**
 * Created by ravi on 8/6/2017.
 */
public class Basepage {
    public WebDriverWait wait = new WebDriverWait(driver,60);



    public void openURL() {
    openDriver opendD = new openDriver();
    driver.get(opendD.url);


    }





public void waitforElement(WebElement element){
    wait.until(ExpectedConditions.visibilityOf(element));

}
}
