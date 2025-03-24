package com.example.Test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RozetkaMainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By searchInput = By.name("search");
    private By resultItemWithLenovo = By.xpath("//span[contains(@class, 'goods-tile__title') and contains(., 'Lenovo')]");

    public RozetkaMainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void open() {
        driver.get("https://rozetka.com.ua/");
    }
    public void searchFor(String query) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput));
        input.clear();
        input.sendKeys(query);
        input.sendKeys(Keys.ENTER);

      //WebElement button = wait.until(ExpectedConditions.elementToBeClickable(searchButton));
      //button.click();
    }
    public boolean isLenovoInResults() {
        try {
            WebElement result = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(resultItemWithLenovo)
            );
            return result.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
