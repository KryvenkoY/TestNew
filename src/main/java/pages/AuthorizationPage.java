package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthorizationPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }
    public WebElement signupName() {
        return driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
    }
    public WebElement signupEmail() {
        return driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
    }
    public WebElement signupButton() {
        return driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
    }
}

