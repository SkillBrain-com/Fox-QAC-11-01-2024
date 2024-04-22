package bsDemo;

import bsDemo.CheckoutPage;
import bsDemo.HomePage;
import bsDemo.LoginPage;
import org.testng.annotations.Test;
import util.BasePage;

public class BuyProductTest extends BasePage {

    @Test
    public void buyProduct(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);


        driver.get("https://bstackdemo.com/");

        homePage.addToCart();
        homePage.verifyCart();
        homePage.checkout();
        loginPage.login("demouser", "testingisfun99");
        checkoutPage.fillShipping();
    }
}
