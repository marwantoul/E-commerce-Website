package Steps;

import Factory.DriverFactory;
import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Option.JsonReader;

public class SignUpWithValidCredentials {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homepage = new HomePage(driver);
    SignupLogin signupLogin = new SignupLogin(driver);
    Signup signup = new Signup(driver);
    AccountCreated accountCreated = new AccountCreated(driver);
    AccountDelete accountDelete = new AccountDelete(driver);
    JsonReader jsonReader = new JsonReader();

    @When("the user enters a correct email address and password")
    public void the_user_enters_a_correct_email_address_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
