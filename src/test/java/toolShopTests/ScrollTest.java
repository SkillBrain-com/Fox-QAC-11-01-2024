package toolShopTests;

import org.testng.annotations.Test;
import toolShop.HomePage;
import util.BasePage;

public class ScrollTest extends BasePage {
    @Test
    public void scroll() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        driver.get("https://practicesoftwaretesting.com/#/");
        homePage.scrollToElement();
        Thread.sleep(4000);
    }
}
