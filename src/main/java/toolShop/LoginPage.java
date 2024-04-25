package toolShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By pageTitle = By.cssSelector(".col-lg-6.auth-form>h3");

    private By userName = By.cssSelector("#email");
    private By password = By.xpath("//div[@class=\"input-group mb-3\"]/child::input[@formcontrolname=\"password\"]");
    private By loginButton = By.cssSelector(".btnSubmit");

    public void verifyRegister(){
        boolean title = driver.findElement(pageTitle).isDisplayed();
        Assert.assertTrue(title);

        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://practicesoftwaretesting.com/#/auth/login");

    }

    public void login(String userName, String password){
        driver.findElement(this.userName).sendKeys(userName);
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
