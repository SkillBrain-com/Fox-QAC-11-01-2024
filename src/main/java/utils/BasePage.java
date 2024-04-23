package utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;

//  Adnotarea @BreforeMethod are grija sa execute metoda imediata urmatoare
//  inaintea fiecarei metode de testare (inaintea fiecarei metode adnotate cu @Test)
    @BeforeMethod(alwaysRun = true)
    public void setup() {

//      Inttantiem clasa ChromeOptions
//      (exista o astfel de clasa corespondenta pentru fiecare browser)
        ChromeOptions options = new ChromeOptions();

//      Utilizand clasei ChromOptions setam diversi parametrii precum modul incognito
        options.addArguments("--incognito");

//      Creem o noua instanta de ChromDriver, iar intre paranteze
//      dam ca si argument intanta de ChromeOptions ca driverul nostru
//      sa ia in considerare setarile facute de noi
//      (exemplu: incognito mode)
        driver = new ChromeDriver(options);

//      Setam rezolutia la care porneste browserul nostru
        driver.manage().window().setSize(new Dimension(1920, 1080));

//      Setam timpul pentru impliciteWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Putem adauga navigarea catre url aici daca testam o singura aplicatie
        //In cazul nostru neavand o aplicatie de test suficient de complexa
        //Vom naviga catre url din fiecare clasa de test in parte
        // driver.get("URL");
    }


//    Adnotarea @BeforeMethod are grija sa execute metoda urmatoare imediata urmatoare
//    dupa fiecare metoda de @Test (dupa fiecare adnotare @Test)
    @AfterMethod(alwaysRun = true)
    public void tearDown() {

//      Inchide pagina web
        driver.quit();
    }
}
