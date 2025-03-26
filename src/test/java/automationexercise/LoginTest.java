package automationexercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AuthorizationPage;
import pages.HomePage;

public class AutoLoginPage extends BaseTest {
    @Test
    public void OpenAutoXercice() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePageAutomationExercise();
        homePage.titleMenuButton();
    }
}
