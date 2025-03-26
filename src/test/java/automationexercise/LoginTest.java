package automationexercise;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthorizationPage;
import pages.FormRegistrationPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void openAutoTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePageAutomationExercise();

        homePage.titleMenuButton();

        AuthorizationPage authorizationPage = new AuthorizationPage(driver);

        authorizationPage.signupName().sendKeys("AdminY");
        authorizationPage.signupEmail().sendKeys("stepa@gmail.com");
        authorizationPage.signupButton().click();

        FormRegistrationPage formRegistrationPage = new FormRegistrationPage(driver);

        //formRegistrationPage.gender().click();
        formRegistrationPage.Name().sendKeys("KillRus");
        //formRegistrationPage.EmailUser().sendKeys("stepa@gmail.com");
        formRegistrationPage.PasswordUser().sendKeys("19911991");
        formRegistrationPage.DataOfBirthDay().sendKeys("1");
        formRegistrationPage.DataOfBirthMonths().sendKeys("January");
        formRegistrationPage.DataOfBirthdayYears().sendKeys("1909");
        //formRegistrationPage.NewsLetter().click();
        //formRegistrationPage.Receive().click();
        formRegistrationPage.FirstName().sendKeys("Stepan");
        formRegistrationPage.LastName().sendKeys("Bandera");
        formRegistrationPage.Company().sendKeys("Organization of Ukrainian Nationalists");
        formRegistrationPage.Address().sendKeys("Galicia");
        formRegistrationPage.Address2().sendKeys("Ukr");
        formRegistrationPage.Country().click();
        formRegistrationPage.State().sendKeys("Staryi Uhryniv");
        formRegistrationPage.City().sendKeys("Lviv");
        formRegistrationPage.ZipCode().sendKeys("070155");
        formRegistrationPage.MobileNumber().sendKeys("0441991199");


        Thread.sleep(3000);

        driver.quit();
    }
    @Test
    public void LoginAndPassword() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePageAutomationExercise();

        homePage.titleMenuButton();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginEmailAddress().sendKeys("stepa@gmail.com");
        loginPage.loginPassword().sendKeys("19911991");
        loginPage.loginButton().click();

        Thread.sleep(3000);

        driver.quit();
    }
}
