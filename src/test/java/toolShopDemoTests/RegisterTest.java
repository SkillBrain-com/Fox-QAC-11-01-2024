package toolShopDemoTests;

import org.testng.annotations.Test;
import toolShopDemo.LoginPage;
import toolShopDemo.RegisterPage;
import utils.BasePage;
import utils.DataGeneration;

public class RegisterTest extends BasePage {
    @Test
    public void registerTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        DataGeneration data = DataGeneration.getInstance();
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://practicesoftwaretesting.com/#/auth/register");

        registerPage.register(data.firstName, data.lastName, data.dateOfBirth, data.address,
                data.postCode, data.city, data.state, data.country, data.phone,
                data.email, data.password);

        loginPage.verifyRegistration();
    }
}
