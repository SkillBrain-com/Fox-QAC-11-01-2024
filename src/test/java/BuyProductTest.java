import org.testng.annotations.Test;

public class BuyProductTest extends BasePage{

    @Test
    public void buyProduct(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);

        driver.get("https://bstackdemo.com/");

        homePage.addToCart();
        homePage.verifyCart();

        loginPage.login("demouser", "testingisfun99");
        checkoutPage.fillShipping();
        OrderConfirmationPage.verifyOrderPlacement();
    }
}
