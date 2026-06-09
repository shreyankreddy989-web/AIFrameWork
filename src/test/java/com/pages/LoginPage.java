package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By searchBox = By.name("q");




    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }
    public void search(String text) {

        driver.findElement(searchBox).sendKeys(text + Keys.ENTER);
    }


}