package bsDemo;

import bsDemo.FavouritesPage;
import bsDemo.HomePage;
import bsDemo.LoginPage;
import org.testng.annotations.Test;
import util.BasePage;

public class AddToFavouritesTest extends BasePage {

    @Test
    public void addToFavourites(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        FavouritesPage favouritesPage = new FavouritesPage(driver);
        driver.get("https://bstackdemo.com/");

        homePage.addToFavourites();
        loginPage.login("demouser", "testingisfun99");
        homePage.addToFavourites();
        homePage.verifyFavouritesClicked();

        String productName = homePage.extractProductName();

        homePage.goToFavourites();
        favouritesPage.verifyFavouriteProduct(productName);

    }
}