package toolShopDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By product = By.xpath("(//a[@class=\"card\"])[9]");
    public void scrollToElement(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(product));
        actions.perform();
    }
}
