package com.pages;

public class AnnotationsDemo {

    public static void main(String[] args) {

        System.out.println("=== TestNG Annotation Flow ===");

        beforeSuite();
        beforeTest();
        beforeClass();

        beforeMethod();
        wakeUp();
        afterMethod();

        beforeMethod();
        goToSchool();
        afterMethod();

        beforeMethod();
        playCricket();
        afterMethod();

        afterClass();
        afterTest();
        afterSuite();
    }

    public static void beforeSuite() {
        System.out.println("0 -> @BeforeSuite");
    }

    public static void afterClass() {
        System.out.println("8 -> @AfterClass");
    }

    public static void beforeTest() {
        System.out.println("1 -> @BeforeTest");
    }



    public static void beforeMethod() {
        System.out.println("3 -> @BeforeMethod");
    }



    public static void afterMethod() {
        System.out.println("5 -> @AfterMethod");
    }

    public static void afterSuite() {
        System.out.println("10 -> @AfterSuite");
    }
    public static void goToSchool() {
        System.out.println("6 -> @Test : Go To School");
    }

    public static void wakeUp() {
        System.out.println("4 -> @Test : Wake Up");
    }
    public static void playCricket() {
        System.out.println("7 -> @Test : Play Cricket");
    }



    public static void afterTest() {
        System.out.println("9 -> @AfterTest");
    }
    public static void beforeClass() {
        System.out.println("2 -> @BeforeClass");
    }


}