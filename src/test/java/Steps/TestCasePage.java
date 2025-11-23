package Steps;

import Factory.DriverFactory;
import Pages.HomePage;
import Pages.TestCasepage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCasePage {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homepage = new HomePage(driver);
    TestCasepage testCasePage = new TestCasepage (driver);

    @When("he user click the Test case link")
    public void he_user_click_the_test_case_link() {
        homepage.TestCaseLinkClick();
    }
    @Then("the user verify that the Test case page is visible successfully")
    public void the_user_verify_that_the_test_case_page_is_visible_successfully() {
        String RA = "TEST CASES";
        System.out.println("résultat attendu"+RA);
        String RO = testCasePage.IsTestCasePageDisplayed();
        System.out.println("résultat obtenu"+RO);
        Assert.assertEquals(RA, RO, "Verify that login page is visible");
    }

}
