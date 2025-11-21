package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Signup extends BasePage {

    public Signup(WebDriver driver) {
        super(driver);
    }


    By MsgSignup = By.xpath("/html/body/section/div/div/div/div[1]/h2/b");
    By MrsCheckBox = By.id("id_gender2");
    By Password = By.id("password");
    By daysSelect = By.id("days");
    By monthsSelect = By.id("months");
    By yearsSelect = By.id("years");
    By newsletter = By.id("newsletter");
    By Optin = By.id("optin");
    By first_name = By.id("first_name");
    By last_name = By.id("last_name");
    By Company = By.id("company");
    By address1 = By.id("address1");
    By address2 = By.id("address2");
    By Country = By.id("country");
    By State = By.id("state");
    By City = By.id("city");
    By Zipcode = By.id("zipcode");
    By mobile_number = By.id("mobile_number");

    By buttonInput = By.xpath("/html/body/section/div/div/div/div[1]/form/button");

    public boolean isSignupDisplayed(){

        return driver.findElement(MsgSignup).isDisplayed();

    }

    public void signupwithfullinformation(String password, String day, String month, String year){
        driver.findElement(MrsCheckBox).click();
        driver.findElement(Password).sendKeys("password");
        selectDropdownValue(daysSelect, day);
        selectDropdownValue(monthsSelect, month);
        selectDropdownValue(yearsSelect, year);
    }

    private void selectDropdownValue(By dropdownLocator, String valueToSelect) {
        Select dropdown = new Select(driver.findElement(dropdownLocator));
        dropdown.selectByVisibleText(valueToSelect);
    }

    public void selectNewsletterandOfferCheckbox() {
        driver.findElement(newsletter).click();
        driver.findElement(Optin).click();
    }

    public void signupwithfullOtherinformation(String firstName, String lastName, String company, String ad1, String ad2,String country,String state,String city,String zipcode,String mobileNumber){

        driver.findElement(first_name).sendKeys(firstName);
        driver.findElement(last_name).sendKeys(lastName);
        driver.findElement(Company).sendKeys(company);
        driver.findElement(address1).sendKeys(ad1);
        driver.findElement(address2).sendKeys(ad2);
        selectDropdownValue(Country, country);
        driver.findElement(State).sendKeys(state);
        driver.findElement(City).sendKeys(city);
        driver.findElement(Zipcode).sendKeys(zipcode);
        driver.findElement(mobile_number).sendKeys(mobileNumber);

    }

    public void ClickSignupButton(){
        driver.findElement(buttonInput).click();

    }
}
