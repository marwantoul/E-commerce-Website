package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLogin extends BasePage {

    public SignupLogin(WebDriver driver) {
        super(driver);
    }


    By MsgSignupLogin = By.xpath("/html/body/section/div/div/div[3]/div/h2");
    By NameInput = By.xpath("//input[@name='name']");
    By emailInput = By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]");
    By buttonInput = By.xpath("/html/body/section/div/div/div[3]/div/form/button");



//    public void isSignupLoginDisplayed1(){
//        WebElement val = driver.findElement(MsgSignupLogin);
//
//        String msg = val.getText();
//
//        System.out.println("mmmmmmm"+msg);
//
//    }

    public boolean isSignupLoginDisplayed(){

        return driver.findElement(MsgSignupLogin).isDisplayed();

    }

    public void signup(String name, String email){

        driver.findElement(NameInput).sendKeys(name);
        driver.findElement(emailInput).sendKeys(email);

    }


    public void ClickSignupButton(){
        driver.findElement(buttonInput).click();

    }
}
