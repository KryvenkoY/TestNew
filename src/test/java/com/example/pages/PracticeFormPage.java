package com.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.URISyntaxException;
import java.time.Duration;

public class PracticeFormPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    public void open() {
        driver.get("https://demoqa.com/automation-practice-form");
    }
    public void fillForm() throws URISyntaxException {
        driver.findElement(By.id("firstName")).sendKeys("Roman");
        driver.findElement(By.id("lastName")).sendKeys("CumX2");
        driver.findElement(By.id("userEmail")).sendKeys("cumRoman@gmail.com");

        WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", gender);
        gender.click();

        driver.findElement(By.id("userNumber")).sendKeys("0981900880");

        WebElement dobInput = driver.findElement(By.id("dateOfBirthInput"));
        dobInput.click();
        new Select(driver.findElement(By.className("react-datepicker__month-select"))).selectByVisibleText("May");
        new Select(driver.findElement(By.className("react-datepicker__year-select"))).selectByVisibleText("1993");
        driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day--022') and not(contains(@class, 'outside-month'))]")).click();

        driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
        driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);

        String path = new File(getClass().getClassLoader().getResource("Test.png").toURI()).getAbsolutePath();
        driver.findElement(By.id("uploadPicture")).sendKeys(path);

        driver.findElement(By.id("currentAddress")).sendKeys("Test address 123");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-3-input"))).sendKeys("NCR", Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-4-input"))).sendKeys("Delhi", Keys.ENTER);

        driver.findElement(By.id("submit")).click();
    }
}
