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

public class RegisterWithExistingEmail {

    WebDriver driver = DriverFactory.getDriver();
    SignupLogin signupLogin = new SignupLogin(driver);

    @When("the user enter a name {string} and existing email {string} address")
    public void the_user_enter_a_name_and_existing_email_address(String name, String email) {
        signupLogin.signupwithexistingemail(name, email);
    }

    @Then("the user verify that the error message email is existing is visible")
    public void the_user_verify_that_the_error_message_email_is_existing_is_visible() {
        String RA = "Email Address already exist!";
        System.out.println("résultat attendu"+RA);
        String RO = signupLogin.ErrorMessageExistingemail();
        System.out.println("résultat obtenu"+RO);
        Assert.assertEquals(RA, RO, "Verify that the error message is visible");
    }

}
