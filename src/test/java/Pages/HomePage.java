package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebsiteAccess extends BasePage {

    public WebsiteAccess(WebDriver driver) {
        super(driver);
    }


    By Login = By.xpath("//input[@name=\"username\"]");

    By Password = By.xpath("//input[@name=\"password\"]");

    By AuthSubmit = By.xpath("//button[@class=\"btnSubmit save-button w-100 ml-0\"]");
    By Msgdashboard = By.xpath("//span[@class=\"menu-title ng-tns-c115-3\"]");

    public void Login (String login, String password){

        driver.findElement(Login).sendKeys(login);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(AuthSubmit).click();

    }

    public boolean isWelcomeDisplayed(){

        return driver.findElement(Msgdashboard).isDisplayed();

    }

}
