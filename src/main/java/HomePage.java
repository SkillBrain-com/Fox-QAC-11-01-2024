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
    private By productPriceDecimal = By.cssSelector("div[id=\"1\"]>.shelf-item__price>.val>span");

    private By cartProductName = By.cssSelector(".shelf-item__details>.title");
    private By cartProductPrice = By.cssSelector(".shelf-item__price>p");
    private By cartTotalPrice = By.cssSelector(".sub-price__val");
    private By favoriteButton = By.cssSelector("div[id=\"1\"]>.shelf-stopper>.MuiButtonBase-root.MuiIconButton-root.Button ");
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

    public void verifyCart() {
 //       !!! doar in cazuri de forta majora folosim:
//        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(productName)));

        String actualProductName = driver.findElement(productName).getText();
        String actualCartProductName = driver.findElement(cartProductName).getText();

        Assert.assertEquals(actualProductName, actualCartProductName);

        String price = "$ " + driver.findElement(productPrice).getText() + driver.findElement(productPriceDecimal).getText();

//        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(cartProductPrice), price));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(cartTotalPrice)));

        String actualCartProductPrice = driver.findElement(cartProductPrice).getText();
        String actualCartTotalPrice = driver.findElement(cartTotalPrice).getText();

        Assert.assertEquals(price, actualCartProductPrice);
        Assert.assertEquals(price, actualCartTotalPrice);
    }
    public void addToFavorites(){
        wait.until(ExpectedConditions.elementToBeClickable(favoriteButton));
        driver.findElement(favoriteButton).click();
    }
    public void verifyFavouritesClicked(){
//        wait.until(ExpectedConditions.attributeContains(favouriteButtonClicked, "class", "clicked"));
       String attribute = driver.findElement(favouriteButtonClicked).getAttribute("class");
       boolean attributeIsPresent = attribute.contains("clicked");
//     SAU, variata mai scurta:
//     boolean ceva = driver.findElement(favouriteButtonClicked).getAttribute("class").contains("clicked");

       Assert.assertTrue(attributeIsPresent);
    }
    public void goToFavourites(){
        driver.findElement(goToFavouritesPage).click();
    }
    public String extractProductName(){
        return driver.findElement(productName).getText();
    }
}
