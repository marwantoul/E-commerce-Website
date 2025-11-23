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
    By emailloginInput = By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]");
    By passwordloginInput = By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]");
    By loginbutton = By.xpath("/html/body/section/div/div/div[1]/div/form/button");
    By ErrorMessage = By.xpath("/html/body/section/div/div/div[1]/div/form/p");
    By LoginPageMEssage = By.xpath("/html/body/section/div/div/div[1]/div[1]/h2");
    By ErrorMessageExistingemail = By.xpath("/html/body/section/div/div/div[3]/div/form/p");
    By ContactUSLink = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[8]/a");



    public boolean isSignupLoginDisplayed(){

        return driver.findElement(MsgSignupLogin).isDisplayed();

    }

    public void signup(String name, String email){

        driver.findElement(NameInput).sendKeys(name);
        driver.findElement(emailInput).sendKeys(email);

    }

    public void signupwithexistingemail(){

        driver.findElement(NameInput).sendKeys("test");
        driver.findElement(emailInput).sendKeys("antoulmarwa1990@gmail.com");

    }


    public void ClickSignupButton(){
        driver.findElement(buttonInput).click();

    }


    public void performLogin(String email, String password) {
        driver.findElement(emailloginInput).clear();
        driver.findElement(emailloginInput).sendKeys(email);

        driver.findElement(passwordloginInput).clear();
        driver.findElement(passwordloginInput).sendKeys(password);
    }


    public void LogInButton(){

        driver.findElement(loginbutton).click();

    }


    // Méthode générique pour récupérer le texte d'un élément
    public String getDisplayedMessage(By locator) {
        return driver.findElement(locator).getText();
    }


    // Getters pour les locators
    public By getErrorMessageLocator() {
        return ErrorMessage;
    }

    public By getLoginPageMessageLocator() {
        return LoginPageMEssage;
    }

    public By getErrorMessageExistingEmailLocator() {
        return ErrorMessageExistingemail;
    }


    public void ContactUsLink (){

        driver.findElement(ContactUSLink).click();

    }

}
