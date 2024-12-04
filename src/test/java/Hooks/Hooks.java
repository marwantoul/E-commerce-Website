package Hooks;

import Factory.DriverFactory;
import Pages.SignupLogin;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;

    @Before
    public void setup() {
        driver = new DriverFactory().initDriver();
        SignupLogin AccessWebSite = new SignupLogin(driver);
        // Accéer à la page d'acceuil avant chaque scénario
        AccessWebSite.HomeLinkPage("https://automationexercise.com/");
    }

//    @After
//    public void tearDown(){
//        driver.quit();
//
//    }
}
