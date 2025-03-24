package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By searchInput = By.name("search");
    private By searchButton = By.cssSelector("button.btn.btn-light.btn-lg");
    private By productContainer = By.cssSelector(".product-layout");
    private By firstProductTitle = By.cssSelector(".product-layout .caption h4 a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // підвищуємо час очікування
    }

    public void searchForProduct(String keyword) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput));
        input.clear();
        input.sendKeys(keyword);

        WebElement button = driver.findElement(searchButton);
        button.click();
    }

    public String getFirstProductTitle() {
        // чекаємо, поки з'явиться контейнер товару
        wait.until(ExpectedConditions.visibilityOfElementLocated(productContainer));
        WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductTitle));
        return product.getText();
    }
}