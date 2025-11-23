package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCasepage extends BasePage {

    public TestCasepage(WebDriver driver) {
        super(driver);
    }

    By Msgtestcasek = By.xpath("/html/body/section/div/div[1]/div/h2/b");



    public String IsTestCasePageDisplayed () {

        String Messagesucces = driver.findElement(Msgtestcasek).getText();

        return Messagesucces;
    }

}

