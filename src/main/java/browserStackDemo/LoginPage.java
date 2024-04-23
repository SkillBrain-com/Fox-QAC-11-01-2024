package browserStackDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    //Construnctor
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //elemente din pagina

    private By usernameField = By.cssSelector("#react-select-2-input");
    private By passwordField = By.cssSelector("#react-select-3-input");
    private By loginButton = By.cssSelector("#login-btn");

    private By errorMessage = By.xpath("//h3[@class=\"api-error\"]");

    //metode cu logica din teste
    public void login(String username, String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(usernameField).sendKeys(Keys.ENTER);

        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(passwordField).sendKeys(Keys.ENTER);

        driver.findElement(loginButton).click();
    }

    public void verifyLoginError(String expectedError){
        String error = driver.findElement(errorMessage).getText();
        Assert.assertEquals(error, expectedError);
    }

}
