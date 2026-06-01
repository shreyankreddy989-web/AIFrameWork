package com.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginpageTests {


       public static void main(String[] args) throws InterruptedException {


           WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();

          driver.get("https://google.com");
           driver.findElement(By.name("q")).sendKeys("Automation");

           Thread.sleep(6000);


        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("testing mini bytes");

        Thread.sleep(5000);
           driver.quit();



    }


}
