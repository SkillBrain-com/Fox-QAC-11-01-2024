package util;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        ChromeOptions options = new ChromeOptions();
     //Deschide browserul in mod incognito
        options.addArguments("--incognito");

     // options.addArguments("--disable-infobars");
        //Creeaza o noua instanta de chrome driver
        driver = new ChromeDriver();
        // seteaza rezolutia ferestrei de browser cand se deschide
        driver.manage().window().setSize(new Dimension(1920, 1080));
        // setam timpul pentru imlicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Putem adauga navigarea catre url aici daca testam o singura aplicatie
        //In cazul nostru neavand o aplicatie de test suficient de complexa
        //Vom naviga catre url din fiecare clasa de test in parte
        // driver.get("URL");
    }

    @AfterMethod(alwaysRun = true)
    // se reluzeaza dupa fiecare test
    public void tearDown() {
        driver.quit();
    }
}