package com.example.tests;


import com.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SearchTest {
    private WebDriver driver;
    private HomePage home;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/");
        home = new HomePage(driver);
    }

    @Test
    public void testProductSearch() {
        home.searchForProduct("MacBook");
        String title = home.getFirstProductTitle();
        Assert.assertTrue(title.contains("MacBook"), "Expected product to contain 'MacBook'");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
