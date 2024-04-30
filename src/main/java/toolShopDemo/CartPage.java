package toolShopDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    private By proceedToCheckout = By.cssSelector("button[data-test=\"proceed-1\"]");
    private By proceedToCheckoutLogin = By.cssSelector("button[data-test=\"proceed-2\"]");
    private By proceedToCheckoutBillingAddress = By.cssSelector("button[data-test=\"proceed-3\"]");

    public void proceedToCheckout (){
        driver.findElement(proceedToCheckout).click();
    }

    public void proceedToCheckoutLogin (){
        driver.findElement(proceedToCheckoutLogin).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckoutBillingAddress));
        driver.findElement(proceedToCheckoutBillingAddress).click();
    }



}
