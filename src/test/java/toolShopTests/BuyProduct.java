package toolShopTests;

import org.testng.annotations.Test;
import toolShop.CartPage;
import toolShop.LoginPage;
import toolShop.MainPage;
import util.BasePage;
import util.DataGeneration;

public class BuyProduct extends BasePage {
//    1. navigam catre pagina principala
//    2. deschidem un produs
//    3. adaugam produsul in cos
//    4. verificam mesajul de adaugare produs in cos
//    5. navigam catre cos
//    6. verificam produs+pret+cantitate+pret total - data viitoare
//    7. proceed to Login
//    8. completam datele
//    9. navigam catre completare adresa
//    10. completam toate campurile
//    11. navigare catre plata
//    12. plata
//    13. verificare plasare comanda

    @Test
    public void buyProduct(){
//        pas 1
        driver.get("https://practicesoftwaretesting.com/#/");
        MainPage mainPage = new MainPage(driver);
        CartPage cartPage = new CartPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        DataGeneration data = DataGeneration.getInstance();
//        Pas 2+3+4+5
        mainPage.openProduct();
//        Pas 7
        cartPage.checkout();
//        Pas 8
        loginPage.login(data.email, data.password);
//        Pas 9+10 - autocompletat
//        Pas 11
        cartPage.checkout2();
        cartPage.checkout3();
//        Pas 12
        cartPage.paymentMethod("Cash on Delivery");
//        Pas 13
        cartPage.verifyCashPayment();
    }
}
