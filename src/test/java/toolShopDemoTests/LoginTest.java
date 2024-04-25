package toolShopDemoTests;

import org.testng.annotations.Test;
import toolShopDemo.LoginPage;
import toolShopDemo.MyAccountPage;
import utils.BasePage;
import utils.DataGeneration;

public class LoginTest extends BasePage {
    @Test
    public void login(){
        LoginPage loginPge = new LoginPage(driver);
        DataGeneration data = DataGeneration.getInstance();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        driver.get("https://practicesoftwaretesting.com/#/auth/login");

        loginPge.login(data.email, data.password);
        String expectedName = data.firstName + " " + data.lastName;
        myAccountPage.verifyAccountName(expectedName);
    }
}
