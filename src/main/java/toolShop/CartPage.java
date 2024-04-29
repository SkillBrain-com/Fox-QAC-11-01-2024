package toolShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    private By checkoutButton = By.cssSelector(".table.table-hover+.float-end>button[class=\"btn btn-success\"]");
    private By choosePaymentDropDown = By.cssSelector("#payment-method");
    private By confirmButton = By.cssSelector("button[data-test=\"finish\"]");
    private By succesfulPayment = By.cssSelector(".help-block");
    private By checkout2 = By.cssSelector(".float-end>button[data-test=\"proceed-2\"]");
    private By checkout3 = By.cssSelector(".float-end>button[data-test=\"proceed-3\"]");

    public void checkout(){
        driver.findElement(checkoutButton).click();
    }
    public void paymentMethod(String paymentChoosing){
        Select dropPayment = new Select(driver.findElement(choosePaymentDropDown));
        dropPayment.selectByVisibleText(paymentChoosing);
        driver.findElement(confirmButton).click();
    }
    public void verifyCashPayment(){
        Assert.assertTrue(driver.findElement(succesfulPayment).isDisplayed());
    }
public void checkout2(){
        driver.findElement(checkout2).click();
}
public void checkout3(){
        wait.until(ExpectedConditions.elementToBeClickable(checkout3));
        driver.findElement(checkout3).click();
}
}
