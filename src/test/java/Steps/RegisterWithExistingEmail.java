package Steps;

import Factory.DriverFactory;
import Pages.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterWithExistingEmail {

    WebDriver driver = DriverFactory.getDriver();
    SignupLogin signupLogin = new SignupLogin(driver);

    @When("the user enter a name and existing email address")
    public void the_user_enter_a_name_and_existing_email_address() {
        signupLogin.signupwithexistingemail();
    }


    @Then("the user verify that the error message email is existing is visible")
    public void the_user_verify_that_the_error_message_email_is_existing_is_visible() {
        String expected = "Email Address already exist!";
        String actual = signupLogin.getDisplayedMessage(signupLogin.getErrorMessageExistingEmailLocator());
        Assert.assertEquals(actual, expected, "Verify that the error message is visible");
    }


}
