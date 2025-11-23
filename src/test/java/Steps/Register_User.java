package Steps;

import Factory.DriverFactory;
import Pages.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Option.JsonReader;

public class Register_User {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homepage = new HomePage(driver);
    SignupLogin signupLogin = new SignupLogin(driver);
    Signup signup = new Signup(driver);
    AccountCreated accountCreated = new AccountCreated(driver);
    AccountDelete accountDelete = new AccountDelete(driver);
    JsonReader jsonReader = new JsonReader();

    @Given("the user navigate to the website")
    public void the_user_navigate_to_the_website() {
        System.out.println("the user navigate to the website");

    }
    @And("the user verify that the home page is visible successfully")
    public void the_user_verify_that_the_home_page_is_visible_successfully() {
        boolean WelcomeDisplayed = new HomePage(driver).isHomePageDisplayed();
        Assert.assertTrue(WelcomeDisplayed, "AutomationExercise");
        System.out.println("the user verify that the home page is visible successfully");
    }
    @When("the user click on the Signup Login button")
    public void the_user_click_on_the_Signup_Login_button() {

        homepage.SignupLoginaccess();
        System.out.println("the user click on the Signup Login button");

    }
    @Then("the user verify that Signup Login page is visible successfully")
    public void the_user_verify_that_Signup_Login_page_is_visible_successfully() {
        //homepage.isSignupLoginDisplayed1();
        boolean SignupLoginpageDisplayed = new SignupLogin(driver).isSignupLoginDisplayed();
        Assert.assertTrue(SignupLoginpageDisplayed, "New User Signup!");
    }
    @When("the user enter a name and email address")
    public void the_user_enter_a_name_and_email_address() {


        String name = jsonReader.getUserName();
        String email = jsonReader.getUserEmail();
        signupLogin.signup(name, email);

    }
    @When("the user click the Signup button")
    public void the_user_click_the_button() {

        signupLogin.ClickSignupButton();
        System.out.println("the user click the Signup button");
    }

    @Then("the user verify that the ENTER ACCOUNT INFORMATION is visible")
    public void the_user_verify_that_the_ENTER_ACCOUNT_INFORMATION_is_visible() {

        boolean SignuppageDisplayed = new Signup(driver).isSignupDisplayed();
        Assert.assertTrue(SignuppageDisplayed, "New User Signup!");

    }

    @When("the user fill in account details like Title, Name, Email, Password, Date of Birth")
    public void the_user_fill_in_account_details_like_Title_Name_Email_Password_Date_of_Birth() {
        String password = jsonReader.getUserPassword();
        String dobDay = jsonReader.getUserDay();
        String dobMonth = jsonReader.getUserMonth();
        String dobYear = jsonReader.getUserYear();
        signup.signupwithfullinformation(password, dobDay, dobMonth, dobYear);
        System.out.println("he user fill in account details like Title, Name, Email, Password, Date of Birth");

    }

    @When("the user select the checkboxes for Sign up for our newsletter and Receive special offers from our partners")
    public void the_user_select_the_checkboxes_for_Sign_up_for_our_newsletter_and_Receive_special_offers_from_our_partners (){

        signup.selectNewsletterandOfferCheckbox();
        System.out.println("he user select the checkboxes");

    }

    @And("the user fill in details for First name, Last name, Company, Address, etc")
    public void the_user_fill_in_details_for_Firstname_Lastname_Company_Address_etc() {
        String FirstName = jsonReader.getUserFirstName();
        String LastName = jsonReader.getUserLastName();
        String Company = jsonReader.getUserCompany();
        String Adress1 = jsonReader.getUserAddress1();
        String Adress2 = jsonReader.getUserAddress2();
        String Country = jsonReader.getUserCountry();
        String State = jsonReader.getUserState();
        String City = jsonReader.getUserCity();
        String ZipCode = jsonReader.getUserZipCode();
        String MobileNumber = jsonReader.getUserMobileNumber();
        signup.signupwithfullOtherinformation(FirstName,LastName,Company,Adress1,Adress2,Country,State,City,ZipCode,MobileNumber);
        System.out.println("the user fill in details for First name, Last name, Company, Address, etc");

    }

    @Then("the user click the Create Account button")
    public void the_user_click_the_Create_Account_button() {
        signup.ClickSignupButton();
        System.out.println("he user click the Create Account button");

    }

    @Then("the user verify that ACCOUNT CREATED is visible")
    public void the_user_verify_that_ACCOUNT_CREATED_is_visible() {
        boolean succesmsgloginDisplayed = new AccountCreated(driver).isSignupmessageOK();
        Assert.assertTrue(succesmsgloginDisplayed, "Account Created!");
    }

    @When("the user click the CONTINUE button")
    public void the_user_click_the_CONTINUE_button() {
        accountCreated.ClickOKButton();
        System.out.println("he user click the CONTINUE button");


    }

    @Then("the user verify that Logged in as username is visible")
    public void the_user_verify_that_Logged_in_as_username_is_visible() {
        String RA = jsonReader.getUserFirstName();
        System.out.println("résultat attendu"+RA);
        String RO = homepage.Logged_in_as_username();
        System.out.println("résultat obtenu"+RO);
        Assert.assertEquals(RA, RO, "Verify that 'Logged in as username' is visible");

    }

    @When("the user click the Delete Account button")
    public void the_user_click_the_Delete_Account_button() {

        homepage.deleteaccount();
        System.out.println("the user click the Delete Account button");

    }

    @Then("the user verify that ACCOUNT DELETED is visible")
    public void the_user_verify_that_ACCOUNT_DELETED_is_visible() {
        boolean acountdeletedmsgDisplayed = new AccountDelete(driver).deleteaccountOK();
        Assert.assertTrue(acountdeletedmsgDisplayed, "Account Deleted!");
    }

    @Then("the user click the Continue button")
    public void the_user_click_the_Continue_button() {

        accountDelete.ClickOKButtonafterdeletedaccount();
        System.out.println("the user click the Continue button");

    }


}
