package Steps;

import Factory.DriverFactory;
import Pages.HomePage;
import Pages.SignupLogin;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class unsuccessfully_login {


    WebDriver driver = DriverFactory.getDriver();
    SignupLogin signupLogin = new SignupLogin(driver);
    HomePage homepage = new HomePage(driver);


    @When("the user enter a email {string} and password {string} invalids")
    public void the_user_enter_a_email_and_password_invalids(String email, String password) {
        signupLogin.performLogin("test@test.com", "1234");
        System.out.println("the user enter a email and password invalids");

    }

    @Then("the user verify that the error message is visible")
    public void the_user_verify_that_the_error_message_is_visible() {
        String expected = "Your email or password is incorrect!";
        String actual = signupLogin.getDisplayedMessage(signupLogin.getErrorMessageLocator());
        System.out.println("Résultat attendu: " + expected);
        System.out.println("Résultat obtenu: " + actual);
        Assert.assertEquals(actual, expected, "Verify that the error message is visible");
    }


}
