package toolShopTests;

import org.testng.annotations.Test;
import toolShop.LoginPage;
import toolShop.RegisterErrorsPage;
import toolShop.RegisterPage;
import util.BasePage;
import util.DataGeneration;

public class RegisterTest extends BasePage {
@Test
public void verifyMandatoryFields(){
    RegisterErrorsPage errorsPage = new RegisterErrorsPage(driver);
    RegisterPage registerPage = new RegisterPage(driver);
    driver.get("https://practicesoftwaretesting.com/#/auth/register");

    registerPage.clickRegister();
    errorsPage.verifyMandatoryFields();
}
    @Test
    public void registerTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        DataGeneration data = DataGeneration.getInstance();
        LoginPage loginPage = new LoginPage(driver);

        driver.get("https://practicesoftwaretesting.com/#/auth/register");

        registerPage.register(data.firstName, data.lastName, "10021994",
                data.address, data.postCode, data.city, data.state, data.country,
                data.phone, data.email, data.password);
        loginPage.verifyRegister();
    }
}
