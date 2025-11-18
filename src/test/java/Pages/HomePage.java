package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    By Msgdashboard = By.xpath("/html/body/section[1]/div/div/div/div/div/div[1]/div[1]/h1");
    By SignupLogin = By.xpath("//a[@href='/login']");
    By usernameloggedin = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a/b");
    By deleteaccount = By.xpath("//a[@href='/delete_account']");
    By viewcartlink = By.xpath("//a[@href='/view_cart']");
    By productslink = By.xpath("//a[@href='/products']");
    By mencategory = By.xpath("/html/body/section[2]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/h4/a");
    By Tshirts = By.xpath("/html/body/section[2]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[2]/div/ul/li[1]/a");
    By brandPolo = By.xpath("//a[@href='/brand_products/Polo']");
    By Logoutlink = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");


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
}
