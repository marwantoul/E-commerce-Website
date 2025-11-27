package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    By Msgdashboard = By.cssSelector("h1 span");;
    By SignupLogin = By.xpath("//a[@href='/login']");
    By usernameloggedin = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a/b");
    By deleteaccount = By.xpath("//a[@href='/delete_account']");
    By viewcartlink = By.xpath("//a[@href='/view_cart']");
    By productslink = By.xpath("//a[@href='/products']");
    By mencategory = By.xpath("/html/body/section[2]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/h4/a");
    By Logoutlink = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");
    By testcaselink = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a");


    public boolean isHomePageDisplayed(){

        return driver.findElement(Msgdashboard).isDisplayed();

    }

    public void SignupLoginaccess(){
        driver.findElement(SignupLogin).click();

    }

    public String Logged_in_as_username(){

        String username = driver.findElement(usernameloggedin).getText();
        //System.out.println("résulat obtenu"+username);

        return username;
    }


    public void CategoryWoomenLink(){
        driver.findElement(mencategory).click();

    }


    public void deleteaccount(){
        driver.findElement(deleteaccount).click();

    }

    public void logout (){

        driver.findElement(Logoutlink).click();

    }

    public void TestCaseLinkClick (){

        driver.findElement(testcaselink).click();

    }


    public void ProductLinkClick (){

        driver.findElement(productslink).click();

    }

    public void CartLinkClick (){

        driver.findElement(viewcartlink).click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("footer"))); // ou un élément en bas

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");


    }
}