package Steps;

import Factory.DriverFactory;
import Pages.HomePage;
import Pages.SignupLogin;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class LogOutUser {

    WebDriver driver = DriverFactory.getDriver();
    SignupLogin signupLogin = new SignupLogin(driver);
    HomePage homepage = new HomePage(driver);

    @When("the user click logout link")
    public void the_user_click_logout_link() {
        homepage.logout();
    }
    @Then("the user verify that Signup \\/ Login page is visible")
    public void the_user_verify_that_signup_login_page_is_visible() {
        String RA = "Login to your account";
        System.out.println("résultat attendu"+RA);
        String RO = signupLogin.LoginPAgeDisplayed();
        System.out.println("résultat obtenu"+RO);
        Assert.assertEquals(RA, RO, "Verify that login page is visible");
    }


}
