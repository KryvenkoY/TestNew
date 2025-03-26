package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public WebElement loginEmailAddress() {
        return driver.findElement(By.xpath("//input[@data-qa='login-email']"));
    }
    public WebElement loginPassword() {
        return driver.findElement(By.xpath("//input[@data-qa='login-password']"));
    }
    public WebElement loginButton() {
        return driver.findElement(By.xpath("//button[@data-qa='login-button']"));
    }
}
