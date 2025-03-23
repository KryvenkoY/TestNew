package com.example.tests;

import com.example.pages.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeFormTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void testFillPracticeForm() throws Exception {
        PracticeFormPage formPage = new PracticeFormPage(driver);
        formPage.open();
        formPage.fillForm();
    }

    @AfterClass

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
