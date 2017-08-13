package com;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by ravi on 7/29/2017.
 */
public class openDriver {
    public static WebDriver driver;
    public static String url;



    public void browser() throws IOException {
        //chrome
        String browser = System.getProperty("browser");
        String environment = System.getProperty("envi");
        String srcFolder = "src\\test\\java\\com\\Propertyfile\\";
        if (browser.equals("chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        }
        //Firefox
        else if (browser.equals("Firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("No Browser Found");
        }

        String envFile = null;
        if (environment.toUpperCase().equals("QA")) {
            envFile = srcFolder + "QA.properties";
        } else if (environment.toUpperCase().equals("Uat")) {
            envFile = srcFolder + "/Uat.properties";
        } else if (environment.toUpperCase().equals("Live")) {
            envFile = srcFolder + "/Live.properties";
        } else if (environment.toUpperCase().equals("Prod")) {
            envFile = srcFolder + "/Prod.properties";
        } else {
            System.out.println("No Environment Found");
        }


       FileInputStream fis = new FileInputStream(envFile);
        Properties pro =new Properties();
        pro.load(fis);
        url = pro.getProperty("url");
        System.out.println(url);



    }

    public void quitBrowser() {

        driver.quit();
    }

    public void quitEnv() {
        quitEnv();
    }

}
