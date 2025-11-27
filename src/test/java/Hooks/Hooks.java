package Hooks;

import Factory.DriverFactory;
import Pages.SignupLogin;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static Factory.DriverFactory.getDriver;

public class Hooks {

    WebDriver driver;

    @Before
    public void setup() {
        driver = new DriverFactory().initDriver();
        SignupLogin AccessWebSite = new SignupLogin(driver);
        // Accéer à la page d'acceuil avant chaque scénario
        AccessWebSite.HomeLinkPage("https://automationexercise.com/");
    }



    @After
    public void tearDown(io.cucumber.java.Scenario scenario) {
        String testCaseName = scenario.getName();
        File destFile = new File("target" + File.separator + "screenshots" + File.separator + testCaseName + ".png");
        takeScreenshot(destFile);
        driver.quit();
    }


    public void takeScreenshot( File destFile)  {

        File file =  ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,destFile);
            InputStream is = new FileInputStream(destFile);
            Allure.addAttachment("screenshot",is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}