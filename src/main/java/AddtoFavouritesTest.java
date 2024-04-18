import org.testng.annotations.Test;

public class AddtoFavouritesTest extends BasePage {

    @Test
    public void addtoFavourites(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        driver.get("https://bstackdemo.com/");

        homePage.addtoFavourites();

        loginPage.login("demouser", "testingisfun99");
        homePage.addtoFavourites();;
        homePage.verifyFavouritesClicked();
        String productName = homePage.extractProductName();

        homePage.goToFavouritesPage();

        homePage.extractProductName();


    }

}
