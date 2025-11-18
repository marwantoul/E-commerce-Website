package Steps;

import Factory.DriverFactory;
import Pages.HomePage;
import Pages.SignupLogin;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Successfully_login {

    WebDriver driver = DriverFactory.getDriver();
    SignupLogin signupLogin = new SignupLogin(driver);
    HomePage homepage = new HomePage(driver);

    @When("the user enter a email {string} and password {string} valids")
    public void the_user_enter_a_email_and_password_valids(String email, String password) {
        signupLogin.validlogin(email,password);

        System.out.println("the user enter a email and password valids");
    }

    @And("the user click the login button")
    public void the_user_click_the_login_button() {
       signupLogin.LogInButton();
        System.out.println("the user click the login button");

    }

    @Then("the user verify that {string} is visible")
    public void the_user_verify_that_is_visible() {
        String RA = "marwa antoul";
        System.out.println("résultat attendu"+RA);
        String RO = homepage.Logged_in_as_username();
        System.out.println("résultat obtenu"+RO);
        Assert.assertEquals(RA, RO, "Verify that 'Logged in as username' is visible");
    }


}
