package toolShopDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPage {
    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    private By accountName = By.cssSelector("#menu");

    public void verifyAccountName(String expectedName){
        String actualName = driver.findElement(accountName).getText();
        Assert.assertEquals(actualName,expectedName);
    }
}
