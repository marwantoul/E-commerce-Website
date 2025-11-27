package Steps;

import Factory.DriverFactory;
import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.ProductPage;
import Utils.ScreenshotUtil;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchProduct {

    WebDriver driver = DriverFactory.getDriver();
    ProductPage product = new ProductPage(driver);
    String lastSearchTerm;
    @When("The user Enter product name {string} in search input and click search button")
    public void the_user_enter_product_name_in_search_input_and_click_search_button(String ProductName) {

        lastSearchTerm = ProductName; // mémorise le mot-clé
        product.ProductSearch(ProductName);
        System.out.println("Le produit cherché est bien saisi dans l'input de recherche");
    }
    @Then("The user Verify all the products related to search are visible")
    public void the_user_verify_all_the_products_related_to_search_are_visible() throws Exception {
        product.ResultProductSearch(lastSearchTerm);
        ScreenshotUtil.takeScreenshot(DriverFactory.getDriver(), "SearchProduct");

    }
}