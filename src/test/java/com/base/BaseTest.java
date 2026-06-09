package com.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.utils.ConfigReader;


public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        ConfigReader config = new ConfigReader();

        driver.get(config.getUrl());
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{

        if (driver != null) {
            Thread.sleep(6000);
            driver.quit();
        }
    }
}