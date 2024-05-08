package toolShopDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addToCart = By.cssSelector("#btn-add-to-cart");
    private By verifyCart = By.cssSelector("span[id=\"lblCartCount\"]");
    private By cart = By.cssSelector("a[aria-label=\"cart\"]");

    public void addProductToCart(){
        driver.findElement(addToCart).click();
        Assert.assertTrue(driver.findElement(verifyCart).isDisplayed());
        driver.findElement(cart).click();

    }



}