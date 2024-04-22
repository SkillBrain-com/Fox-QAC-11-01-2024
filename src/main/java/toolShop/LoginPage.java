package toolShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By pageTitle = By.cssSelector("div[class=\"col-lg-6 auth-form\"]>h3");


    public void verifyRegister(){

        boolean title = driver.findElement(pageTitle).isDisplayed();
        Assert.assertTrue(title);

        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://practicesoftwaretesting.com/#/auth/login");


    }
}
