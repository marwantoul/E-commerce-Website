package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountDelete extends BasePage {

    public AccountDelete(WebDriver driver) {
        super(driver);
    }


    By MsgdeleteaccountOK = By.xpath("/html/body/section/div/div/div/h2/b");
    By OKButtondeleteaccount = By.xpath("/html/body/section/div/div/div/div/a");

    public boolean deleteaccountOK(){

        return driver.findElement(MsgdeleteaccountOK).isDisplayed();

    }


    public void ClickOKButtonafterdeletedaccount(){
        driver.findElement(OKButtondeleteaccount).click();

    }
}

