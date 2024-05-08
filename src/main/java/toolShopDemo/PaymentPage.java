package toolShopDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PaymentPage {
    WebDriver driver;
    //WebDriverWait wait;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        //this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    private By paymentMethod = By.cssSelector("#payment-method");
    private By confirmButton = By.cssSelector("button[data-test=\"finish\"]");
    private By paymentSuccessful = By.cssSelector(".help-block");

    public void payment(String payment){
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(paymentMethod));
        Select paymentDrop = new Select(driver.findElement(paymentMethod));
        paymentDrop.selectByVisibleText(payment);
        driver.findElement(confirmButton).click();
        Assert.assertTrue(driver.findElement(paymentSuccessful).isDisplayed());
    }
}
