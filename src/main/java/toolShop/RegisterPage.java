package toolShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstName = By.cssSelector("#first_name");
    private By lastName = By.cssSelector("#last_name");

    private By dateOfBirth = By.cssSelector("#dob");

    private By address = By.cssSelector("#address");
    private By postCode = By.cssSelector("#postcode");
    private By city = By.cssSelector("#city");
    private By state = By.cssSelector("#state");

    private By countryDropdown = By.cssSelector("#country");

    private By phone = By.cssSelector("#phone");
    private By email = By.cssSelector("#email");
    private By password = By.cssSelector("#password");

    private By submit = By.cssSelector("button[type=\"submit\"]");

    public void register(String firstName, String lastName, String dateOfBirth,
                         String address, String postCode, String city, String state,
                         String country, String phone, String email, String password){
        driver.findElement(this.firstName).sendKeys(firstName);
        driver.findElement(this.lastName).sendKeys(lastName);

        driver.findElement(this.dateOfBirth).sendKeys(dateOfBirth);

        driver.findElement(this.address).sendKeys(address);
        driver.findElement(this.postCode).sendKeys(postCode);
        driver.findElement(this.city).sendKeys(city);
        driver.findElement(this.state).sendKeys(state);

        //Instantiem clasa Select careia ii dam ca si parametru dropDownnul nostru
        //apoi folosind ebiectul de tip select creat
        // putem sa selectam dupa diverse criterii(text vizivbil, index, etc)
        Select dropCountry = new Select(driver.findElement(countryDropdown));
        dropCountry.selectByVisibleText(country);

        driver.findElement(this.phone).sendKeys(phone);
        driver.findElement(this.email).sendKeys(email);
        driver.findElement(this.password).sendKeys(password);

        driver.findElement(submit).click();

    }
}
