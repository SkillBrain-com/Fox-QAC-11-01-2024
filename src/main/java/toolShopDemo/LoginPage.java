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

    private By userName = By.cssSelector(".input-group.mb-3>input[placeholder=\"Your E-mail *\"]");
    private By password = By.xpath("//div[@class=\"input-group mb-3\"]/child::input[@formcontrolname=\"password\"]");
    private By login = By.xpath("//input[@data-test=\"login-submit\"]");

    public void verifyRegistration(){
        boolean titleViz = driver.findElement(pageTitle).isDisplayed();
        Assert.assertTrue(titleViz);

        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://practicesoftwaretesting.com/#/auth/login");
    }

    public void login(String userName,String password){
        driver.findElement(this.userName).sendKeys(userName);
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(login).click();
    }
}
