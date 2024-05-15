package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestListeners implements ITestListener {
    static WebDriver driver;
    String filePath;

    @Override
    public void onTestFailure(ITestResult result){
        String testName = result.getName().trim();
        takeScreenshot(testName, driver);
    }

    public void takeScreenshot(String testName, WebDriver driver){
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try{
            Path projectPath = Paths.get("");
            filePath = projectPath.toAbsolutePath() + "\\test-output\\";

            FileUtils.copyFile(srcFile, new File(filePath + testName + ".jpg"));
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
