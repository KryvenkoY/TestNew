package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormRegistrationPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public FormRegistrationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public WebElement gender() {
        return driver.findElement(By.xpath("//input[@id='id_gender1']"));
    }
    public WebElement Name() {
        return driver.findElement(By.xpath("//input[@data-qa='name']"));
    }
    public WebElement EmailUser() {
        return driver.findElement(By.xpath("//input[@data-qa='email']"));
    }
    public WebElement PasswordUser() {
        return driver.findElement(By.xpath("//input[@data-qa='password']"));
    }
    public WebElement DataOfBirthDay() {
        return driver.findElement(By.xpath("//select[@data-qa='days']"));
    }
    public WebElement DataOfBirthMonths() {
        return driver.findElement(By.xpath("//select[@data-qa='months']"));
    }
    public WebElement DataOfBirthdayYears() {
        return driver.findElement(By.xpath("//select[@data-qa='years']"));
    }
    public WebElement NewsLetter() {
        return driver.findElement(By.xpath("//input[@id='newsletter']"));
    }
    public WebElement Receive() {
        return driver.findElement(By.xpath("//input[@id='optin']"));
    }
    public WebElement FirstName() {
        return driver.findElement(By.xpath("//input[@data-qa='first_name']"));
    }
    public WebElement LastName() {
        return driver.findElement(By.xpath("//input[@data-qa='last_name']"));
    }
    public WebElement Company() {
        return driver.findElement(By.xpath("//input[@data-qa='company']"));
    }
    public WebElement Address() {
        return driver.findElement(By.xpath("//input[@data-qa='address']"));
    }
    public WebElement Address2() {
        return driver.findElement(By.xpath("//input[@data-qa='address2']"));
    }
    public WebElement Country() {
        return driver.findElement(By.xpath("//option[@value='Australia']"));
    }
    public WebElement State() {
        return driver.findElement(By.xpath("//input[@id='state']"));
    }
    public WebElement City() {
        return driver.findElement(By.xpath("//input[@id='city']"));
    }
    public WebElement ZipCode() {
        return driver.findElement(By.xpath("//input[@id='zipcode']"));
    }
    public WebElement MobileNumber() {
        return driver.findElement(By.xpath("//input[@id='mobile_number']"));
    }
    public WebElement CreateAccountButton() {
        return driver.findElement(By.xpath("//button[@data-qa='create-account']"));
    }

}

