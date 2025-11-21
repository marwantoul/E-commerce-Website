package Steps;

import Factory.DriverFactory;
import Pages.Contactus;
import Pages.SignupLogin;
import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ContactUs {

    WebDriver driver = DriverFactory.getDriver();
    SignupLogin signupLogin = new SignupLogin(driver);
    Contactus contactUs = new Contactus(driver);

    @When("he user click the Contact us link")
    public void he_user_click_the_contact_us_link() {
        signupLogin.ContactUsLink();
    }
    @Then("the user verify that the contact us page is visible successfully")
    public void the_user_verify_that_the_contact_us_page_is_visible_successfully() {
        String RA = "CONTACT US";
        System.out.println("résultat attendu"+RA);
        String RO = contactUs.isContactUsDisplayed();
        System.out.println("résultat obtenu"+RO);
        Assert.assertEquals(RA, RO, "Verify that contact us page is visible");
    }
    @When("the user enter a name and email address and subject and message and file")
    public void the_user_enter_a_name_and_email_address_and_subject_and_message_and_file() {
        contactUs.ContactUswithfullinformation();
    }
    @When("the user click the Submit button")
    public void the_user_click_the_submit_button() {
        contactUs.SubmitClic();
    }
    @Then("the user verify that a confirmation popup is visible successfully")
    public void the_user_verify_that_a_confirmation_popup_is_visible_successfully() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Press OK to proceed!"), "Popup text is incorrect");

    }
    @When("the user click on OK bouton")
    public void the_user_click_on_ok_bouton() {
        contactUs.handleConfirmationPopup();
    }
    @Then("the user verify that the successfully submit is visible")
    public void the_user_verify_that_the_successfully_submit_is_visible() {

        String message = contactUs.getSuccessMessage();
        Assert.assertTrue(message.contains("Success!"), "Submit confirmation not visible");
        System.out.println("Confirmation message: " + message);

    }
}
