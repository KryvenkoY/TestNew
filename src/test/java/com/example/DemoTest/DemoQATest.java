package com.example.DemoTest;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.URISyntaxException;


import java.io.File;
import java.time.Duration;

public class DemoQATest {
    WebDriver driver;
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void fillPracticeForm() throws InterruptedException, URISyntaxException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName")).sendKeys("Yegor");
        driver.findElement(By.id("lastName")).sendKeys("Cum");
        driver.findElement(By.id("userEmail")).sendKeys("qatest@gmail.com");
        WebElement genderMale = driver.findElement(By.xpath("//label[text()='Male']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", genderMale);
        genderMale.click();
        driver.findElement(By.id("userNumber")).sendKeys("0961901919");
        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthInput.click();
        new Select(driver.findElement(By.className("react-datepicker__month-select"))).selectByVisibleText("May");
        new Select(driver.findElement(By.className("react-datepicker__year-select"))).selectByVisibleText("1993");
        driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day--022') and not(contains(@class, 'outside-month'))]")).click();

        driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
        driver.findElement(By.id("subjectsInput")).sendKeys("\n");

        driver.findElement(By.xpath("//label[text()='Sports']")).click();
        driver.findElement(By.xpath("//label[text()='Music']")).click();

        String path = new File(getClass().getClassLoader().getResource("Test.png").toURI()).getAbsolutePath();
        WebElement uploadElement = driver.findElement(By.id("uploadPicture"));
        uploadElement.sendKeys(path);

        driver.findElement(By.id("currentAddress")).sendKeys("Test address 132");

        WebElement stateInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-3-input")));
        stateInput.sendKeys("NCR");
        stateInput.sendKeys(Keys.ENTER);

        WebElement cityInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-4-input")));
        cityInput.sendKeys("Delhi");
        cityInput.sendKeys(Keys.ENTER);

        driver.findElement(By.id("submit")).click();

        Thread.sleep(3000);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
