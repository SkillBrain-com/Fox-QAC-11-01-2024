package toolShopDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterErrorsPage {

    WebDriver driver;

    public RegisterErrorsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstNameErr = By.cssSelector("div[data-test=\"first-name-error\"]");
    private By lastNameErr = By.cssSelector("div[data-test=\"last-name-error\"]");
    private By dateOfBirthErr = By.cssSelector("div[data-test=\"dob-error\"]");
    private By addressErr = By.cssSelector("div[data-test=\"address-error\"]");
    private By postCodeErr = By.cssSelector("div[data-test=\"postcode-error\"]");
    private By cityErr = By.cssSelector("div[data-test=\"city-error\"]");
    private By stateErr = By.cssSelector("div[data-test=\"state-error\"]");
    private By countryErr = By.cssSelector("div[data-test=\"country-error\"]");
    private By phoneErr = By.cssSelector("div[data-test=\"phone-error\"]");
    private By emailErr = By.cssSelector("div[data-test=\"email-error\"]");
    private By passwordErr = By.cssSelector("div[data-test=\"password-error\"]");

    public void verifyMandatoryFields(){
        Assert.assertTrue(driver.findElement(firstNameErr).isDisplayed());
        Assert.assertTrue(driver.findElement(lastNameErr).isDisplayed());
        Assert.assertTrue(driver.findElement(dateOfBirthErr).isDisplayed());
        Assert.assertTrue(driver.findElement(addressErr).isDisplayed());
        Assert.assertTrue(driver.findElement(postCodeErr).isDisplayed());
        Assert.assertTrue(driver.findElement(cityErr).isDisplayed());
        Assert.assertTrue(driver.findElement(stateErr).isDisplayed());
        Assert.assertTrue(driver.findElement(countryErr).isDisplayed());
        Assert.assertTrue(driver.findElement(phoneErr).isDisplayed());
        Assert.assertTrue(driver.findElement(emailErr).isDisplayed());
        Assert.assertTrue(driver.findElement(passwordErr).isDisplayed());
    }

}
