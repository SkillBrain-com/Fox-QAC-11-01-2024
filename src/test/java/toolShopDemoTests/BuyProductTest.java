package toolShopDemoTests;

import org.testng.annotations.Test;
import toolShopDemo.*;
import utils.BasePage;
import utils.DataGeneration;

public class BuyProductTest extends BasePage {

    // navigam catre pagina principala
    // deschidem un produs la alegere
    // adaugam produsul in cos
    // verificam ca s-a adaugat produsul in cos
    // navigam catre cos
    // apasam pe checkout
    // executam un login
    // proceed to checkout
    // shipping details care se completeaza automat --> click pe proceed to checkout
    // payment method --> select din care alegem varianta de plata
    // apasam pe butonul de confirmare click
    //veirificam ca plata s-a facut cu succes --> verificam vizibilitatea mesajului

    @Test
    public void buyProduct(){
        HomePage homePage = new HomePage(driver);
        DataGeneration data = DataGeneration.getInstance();
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        driver.get("https://practicesoftwaretesting.com/#/");

        homePage.clickProduct();
        productPage.addProductToCart();
        cartPage.proceedToCheckout();
        loginPage.login(data.email, data.password);

        cartPage.proceedToCheckoutLogin();
        paymentPage.payment("Cash on Delivery");
    }


}
