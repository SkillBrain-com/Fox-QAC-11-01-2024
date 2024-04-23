package toolShopDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPage {
    //Driver
    WebDriver driver;

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Elem
    private By pageTitle = By.cssSelector(".col-lg-6.auth-form>h3");

    //Asertii
    public void verifyRegistration(){
      //verif ca elem apare in pag
        boolean titleViz = driver.findElement(pageTitle).isDisplayed();
        Assert.assertTrue(titleViz);

        //verif ca pag e corecta
        String url =driver.getCurrentUrl();
        Assert.assertEquals(url, "https://practicesoftwaretesting.com/#/auth/login");
    }
}
