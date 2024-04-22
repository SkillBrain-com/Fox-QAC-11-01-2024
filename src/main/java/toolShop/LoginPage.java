package toolShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

import static util.BasePage.driver;

public class LoginPage {
    WebDriver Driver;

    public LoginPage(WebDriver driver) {
        Driver = driver;
    }
    public By pageTitle = By.cssSelector("div[class=\"col-lg-6 auth-form\"].h3");

    public void verifyRegister(){
        boolean title = driver.findElement(pageTitle).isDisplayed();

    }
}

