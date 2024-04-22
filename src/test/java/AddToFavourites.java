import org.testng.annotations.Test;

public class AddToFavourites extends BasePage {

    @Test
    public void addToFavourites(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        FavouritesPage favouritesPage = new FavouritesPage(driver);
        driver.get("https://bstackdemo.com/signin");
        homePage.addToFavourites();
        loginPage.login("demouser", "testingisfun99");
        homePage.addToFavourites();
        homePage.verifyFavouritesClicked();
        String productName = homePage.extractProductName();

        homePage.goToFavourites();
        favouritesPage.verifyFavouriteProduct(productName);


    }

}
