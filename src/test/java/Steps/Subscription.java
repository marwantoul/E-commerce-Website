package Steps;

import Factory.DriverFactory;
import Pages.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Subscription {

    WebDriver driver = DriverFactory.getDriver();
    HomePage home = new HomePage(driver);
    CartPAge cartpage = new CartPAge(driver);

    @When("the user click the Cart link")
    public void the_user_click_the_cart_link() {
        home.CartLinkClick();
    }

    @Then("the user verify that the Subscription input is visible successfully")
    public void the_user_verify_that_the_subscription_input_is_visible_successfully() {
        cartpage.EmailAdresseIsDisplayed();
    }
    @When("The user Enter email adresse in search input and click OK button")
    public void the_user_enter_email_adresse_in_search_input_and_click_ok_button() {
        cartpage.PutEmailAdresse();
        cartpage.ClickBoutonOK();
    }
    @Then("The user Verify that the success message {string} is visible")
    public void the_user_verify_that_the_success_message_is_visible(String string) {
        cartpage.SuccessMsgIsDisplayed();
    }

}
