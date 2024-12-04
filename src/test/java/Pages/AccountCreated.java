package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreated extends BasePage {

    public AccountCreated(WebDriver driver) {
        super(driver);
    }


    By MsgSignupOK = By.xpath("/html/body/section/div/div/div/h2/b");
    By OKButton = By.xpath("/html/body/section/div/div/div/div/a");

    public boolean isSignupmessageOK(){

        return driver.findElement(MsgSignupOK).isDisplayed();

    }


    public void ClickOKButton(){
        driver.findElement(OKButton).click();

    }
}

