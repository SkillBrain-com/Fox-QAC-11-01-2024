package bsDemoTest;

import bsDemoTest.CheckoutPage;
import bsDemoTest.HomePage;
import bsDemoTest.LoginPage;
import bsDemoTest.OrderConfirmationPage;
import org.testng.annotations.Test;
import util.BasePage;

public class BuyProductTest extends BasePage {

    @Test
    public void buyProduct() throws InterruptedException {
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
