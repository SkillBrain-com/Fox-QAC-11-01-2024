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
//    metoda invocata la inceputul fiecarui test
    public void setup() {
        ChromeOptions options = new ChromeOptions();
//        deschide browserul in modul incognito
        options.addArguments("--incognito");
//        ar trebui sa scoata bara "Chrome is being controled....."
//        dar in ultimile versiuni nu mai functioneaza:
//        options.addArguments("--disable-infobars");
//        creeaza o noua instanta de CHrome driver
        driver = new ChromeDriver(options);
//        seteaza rezolutia ferestrei de browser cand se deschide
        driver.manage().window().setSize(new Dimension(1920, 1080));
//        setam timpul pentru Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Putem adauga navigarea catre url aici daca testam o singura aplicatie
        //In cazul nostru neavand o aplicatie de test suficient de complexa
        //Vom naviga catre url din fiecare clasa de test in parte
        // driver.get("URL");
    }

    @AfterMethod(alwaysRun = true)
//    metoda invocata dupa fiecare test:
    public void tearDown() {
//        inchide browserul:
        driver.quit();
    }
}
