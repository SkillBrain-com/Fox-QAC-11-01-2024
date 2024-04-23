package toolShopDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By pageTitle = By.cssSelector(".col-lg-6.auth-form>h3");

    public void verifyRegistration(){
        boolean titleViz = driver.findElement(pageTitle).isDisplayed();
        Assert.assertTrue(titleViz);

        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://practicesoftwaretesting.com/#/auth/login");
    }
}
