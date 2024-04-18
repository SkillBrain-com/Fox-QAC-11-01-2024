import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrderConfirmationPage {
    WebDriver driver;
    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

//    elemente
    private By succesMessage = By.cssSelector("#confirmation-message");
    private By orderNumber = By.cssSelector(".form-legend-container+div");

//    Metodele cu pasii
    public void verifyOrderPlacement(){
        String actualSuccesMessage = driver.findElement(succesMessage).getText();
        Assert.assertEquals(actualSuccesMessage, "Your Order has been successfully placed.");

        boolean elementIsPresent = driver.findElement(orderNumber).isDisplayed();
        Assert.assertTrue(elementIsPresent);
    }
}
