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
    //Metoda invocata la inceputul fiecarui test
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        //Deschide browserul in modul incognito
        options.addArguments("--incognito");
        //Ar trebui sa scoata bara "Chrome is being controled by automated software",
        //Dar in ultimele versiuni de chrome nu mai functioneaza
        //options.addArguments("--disable-infobars");

        //Creeaza o noua instanta de chrome driver
        driver = new ChromeDriver(options);
        //seteaza rezolutia ferestrei de browser cand se deschide
        driver.manage().window().setSize(new Dimension(1920, 1080));
        //setam timpul pentru implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Putem adauga navigarea catre url aici daca testam o singura aplicatie
        //In cazul nostru neavand o aplicatie de test suficient de complexa
        //Vom naviga catre url din fiecare clasa de test in parte
        // driver.get("URL");
    }

    @AfterMethod(alwaysRun = true)
    //Se ruleaza dupa fiecare test
    public void tearDown() {
        //Inchide browserul
        driver.quit();
    }
}
