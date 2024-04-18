import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrderConfirmationPage {

    //Constructor
    WebDriver driver;
    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

//    Elemente
    private By successMessage = By.cssSelector("#confirmation-message");
    private By orderNumber = By.cssSelector(".form-legend-container+div");

    public void verifyOrderPlacement(){
        String actualSuccessMessage = driver.findElement(successMessage).getText();
        Assert.assertEquals(actualSuccessMessage, "Your Order has been successfully placed.");

        boolean elementIsPresent = driver.findElement(orderNumber).isDisplayed();
        Assert.assertTrue(elementIsPresent);

    }
}
