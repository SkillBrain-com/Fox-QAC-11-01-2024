package toolShopDemoTests;

import org.testng.annotations.Test;
import toolShopDemo.*;
import utils.BasePage;
import utils.DataGeneration;

public class BuyProductTest extends BasePage {

//    navigam catre pag principala
//    deschidem un produs la alegere
//    adaugam produsul in cos
//    verificam ca ni s-a adaugat produsul in cos
//    navigam catre cos
//    apasam pe checkout
//    executam un login
//    proced to checkout
//    shipping details --> click pe proceed to checkout
//    payment method --> select unde vom alege o varianta de plata
//    buton de confirmare click
//    verificam ca plata s-a facut cu succes --> verificam vizibilitatea mesajului

    @Test
    public void buyProduct(){
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        DataGeneration data = DataGeneration.getInstance();

        driver.get("https://practicesoftwaretesting.com/#/");

        homePage.clickProduct();
        productPage.addProductToCart();
        cartPage.proceedToCheckout();
        loginPage.login(data.email, data.password);
        cartPage.proceedToCheckoutLogin();
        paymentPage.payment("Cash on Delivery");


    }
}
