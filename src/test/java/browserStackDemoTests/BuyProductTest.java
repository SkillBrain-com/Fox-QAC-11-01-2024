package browserStackDemoTests;

import browserStackDemo.CheckoutPage;
import browserStackDemo.HomePage;
import browserStackDemo.LoginPage;
import browserStackDemo.OrderConfirmationPage;
import org.testng.annotations.Test;
import utils.BasePage;

public class BuyProductTest extends BasePage {

    @Test
    public void buyProduct() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);

        driver.get("https://bstackdemo.com/");

        homePage.addToCart();
        homePage.verifyCart();
        homePage.checkout();
        loginPage.login("demouser", "testingisfun99");
        checkoutPage.fillShipping();
        orderConfirmationPage.verifyOrderPlacement();
    }
}
