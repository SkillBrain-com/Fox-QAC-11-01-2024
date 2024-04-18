import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Elemente
    private By usernameSpan = By.xpath("//span[@class=\"username\"]");
    private By logoutButton = By.xpath("//a[@id=\"logout\"]");

    private By addToCart = By.cssSelector("div[id=\"1\"]>.shelf-item__buy-btn");
    private By checkoutButton = By.cssSelector(".buy-btn");

    private By productName = By.cssSelector("div[id=\"1\"]>.shelf-item__title");
    private By productPrice = By.cssSelector("div[id=\"1\"]>.shelf-item__price>.val>b");
    private By productPriceDeciaml = By.cssSelector("div[id=\"1\"]>.shelf-item__price>.val>span");

    private By cartProductName = By.cssSelector(".shelf-item__details>.title");
    private By cartProductPrice = By.cssSelector(".float-cart__shelf-container>.shelf-item>.shelf-item__price>p");
    private By cartTotalPrice = By.cssSelector(".sub-price__val");

    private By favouriteButton = By.cssSelector("div[id=\"1\"]>.shelf-stopper>.MuiButtonBase-root.MuiIconButton-root.Button");
    private By favouriteButtonClicked = By.cssSelector("div[id=\"1\"]>.shelf-stopper>button");

    private By goToFavouritesPage = By.cssSelector("#favourites");

    //Metodele cu pasii
    public void verifyLogin(){
        String username = driver.findElement(usernameSpan).getText();
        Assert.assertEquals(username, "demouser");

        String button = driver.findElement(logoutButton).getText();
        Assert.assertEquals(button, "Logout");

        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://bstackdemo.com/?signin=true");
    }

    public void addToCart(){
        driver.findElement(addToCart).click();
    }

    public void checkout(){
        driver.findElement(checkoutButton).click();
    }

    public void verifyCart(){

        String actualProductName = driver.findElement(productName).getText();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(cartProductName, actualProductName));
        String actualCartProductName = driver.findElement(cartProductName).getText();

        Assert.assertEquals(actualProductName, actualCartProductName);

        String actualProductPrice ="$ " + driver.findElement(productPrice).getText() + driver.findElement(productPriceDeciaml).getText();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(cartProductPrice, actualProductPrice));
        String actualCartProductPrice = driver.findElement(cartProductPrice).getText();
        String actualCartTotalPrice = driver.findElement(cartTotalPrice).getText();

        Assert.assertEquals(actualProductPrice, actualCartProductPrice);
        Assert.assertEquals(actualProductPrice, actualCartTotalPrice);
    }

    public void addToFavourites(){
        wait.until(ExpectedConditions.elementToBeClickable(favouriteButton));
        driver.findElement(favouriteButton).click();
    }

    public void verifyFavouritesClicked(){
       String attribute = driver.findElement(favouriteButtonClicked).getAttribute("class");
       boolean attributeIsPresent = attribute.contains("clicked");

//       boolean ceva = driver.findElement(favouriteButtonClicked)
//               .getAttribute("class").contains("clicked");

       Assert.assertTrue(attributeIsPresent);
    }

    public void goToFavourites(){
        driver.findElement(goToFavouritesPage).click();
    }

    public String extractProductName(){
        return driver.findElement(productName).getText();
    }
}
