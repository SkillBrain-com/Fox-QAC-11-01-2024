package toolShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MainPage {
    WebDriver driver;
WebDriverWait wait;
    public MainPage(WebDriver driver) {
        this.driver = driver;
this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    private By product = By.xpath("(//img[@class=\"card-img-top\"])[9]");

    private By addToCartButton = By.cssSelector(".btn-success.btn");
    private By numberOfProducts = By.cssSelector("span[id=\"lblCartCount\"]");
    private By cart = By.cssSelector(".nav-link>.fa.fa-shopping-cart.px-1");

    public void openProduct(){

        driver.findElement(product).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        driver.findElement(addToCartButton).click();

        Assert.assertTrue(driver.findElement(numberOfProducts).isDisplayed());

        driver.findElement(cart).click();
    }
}
