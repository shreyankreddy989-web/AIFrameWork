package com.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginpageTests {


    String url =  "https://google.com";



    void get(String url){

    }


       public static void main(String[] args) throws InterruptedException {


           WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
           WebDriver driver2 = new ChromeDriver();

           WebDriver driver3 = new ChromeDriver();
           WebDriver driver4 = new ChromeDriver();

           WebDriver driver5 = new ChromeDriver();
           WebDriver driver6 = new ChromeDriver();






         //  driver.manage().window().maximize();






//           driver.get("https://www.accuweather.com/en/in/india-weather");
//
//         List<WebElement> elements =   driver.findElements(By.xpath("//div[@class='nearby-locations-list']/child::*"));
//


//         System.out.println("size : " + elements.size());
//
//         // elements.stream().forEach(e -> e.getText());
//

//           // //div[@class='nearby-locations-list']/child::*

           driver.get("https://youtube.com");
           driver2.get("https://google.com");
           driver3.get("https://youtube.com");
           driver4.get("https://google.com");
           driver5.get("https://google.com");
           driver6.get("https://google.com");

           driver.findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
            driver2.findElement(By.name("search")).sendKeys("Automation", Keys.ENTER);
            driver3.findElement(By.name("login")).sendKeys("Automation", Keys.ENTER);
             driver4.findElement(By.name("login")).sendKeys("Automation", Keys.ENTER);
             driver5.findElement(By.name("login")).sendKeys("Automation", Keys.ENTER);
             driver6.findElement(By.name("login")).sendKeys("Automation", Keys.ENTER);
//        driver.get("https://google.com");
//        driver.findElement(By.name("q")).sendKeys("testing mini bytes");
//
//        Thread.sleep(3500);
           driver.quit();
            driver2.quit();
             driver3.quit();
             driver4.quit();
             driver5.quit();
             driver6.quit();



    }


}
