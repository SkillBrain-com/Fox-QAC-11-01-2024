package browserStackDemoTests;

import browserStackDemo.HomePage;
import browserStackDemo.LoginPage;
import org.testng.annotations.Test;
import utils.BasePage;

public class LoginTests extends BasePage {


    @Test
    public void successfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        driver.get("https://bstackdemo.com/signin");
        loginPage.login("demouser", "testingisfun99");
        homePage.verifyLogin();
    }

    @Test
    public void unsuccessfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://bstackdemo.com/signin");
        loginPage.login("cevauser", "parola");
        loginPage.verifyLoginError("Invalid Username");
    }

    @Test
    public void lockedAccount(){
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://bstackdemo.com/signin");
        loginPage.login("locked_user", "testingisfun99");
        loginPage.verifyLoginError("Your account has been locked.");
    }


}
