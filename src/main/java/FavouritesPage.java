import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FavouritesPage {
//constructor
    WebDriver driver;

    public FavouritesPage(WebDriver driver) {
        this.driver = driver;
    }

    //elemente
    By productName = By.cssSelector("div[id=\"1\"]>shelf-item__title");

    public void verifyFavouriteProduct(String productName){
        String favouriteProductName = driver.findElement(this.productName).getText();

        Assert.assertEquals(productName, favouriteProductName);
    }
}
