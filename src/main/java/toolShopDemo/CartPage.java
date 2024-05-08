package toolShopDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By proceedToCheckout = By.cssSelector("button[data-test=\"proceed-1\"]");
    private By proceedToCheckoutLogin = By.cssSelector("button[data-test=\"proceed-2\"]");
    private By proceedToCheckoutBillingAddress = By.cssSelector("button[data-test=\"proceed-3\"]");

    public void proceedToCheckout(){
        driver.findElement(proceedToCheckout).click();

    }

    public void proceedToCheckoutLogin(){
        driver.findElement(proceedToCheckoutLogin).click();
        driver.findElement(proceedToCheckoutBillingAddress).click();
    }
}
