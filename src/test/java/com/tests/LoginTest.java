package com.tests;

import com.base.BaseTest;
import com.pages.LoginPage;
import org.testng.annotations.Test;
import org.testng.Assert;




public class LoginTest extends BaseTest {

    @Test
    public void openGoogle() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.search("YouTube");



        Assert.assertTrue(loginPage.getTitle().contains("YouTube"));

    }

    }
