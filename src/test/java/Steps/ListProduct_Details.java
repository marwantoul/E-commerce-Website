package Steps;

import Factory.DriverFactory;
import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.ProductPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ListProduct_Details {

    WebDriver driver = DriverFactory.getDriver();
    ProductPage product = new ProductPage(driver);
    ProductDetailsPage productdetails = new ProductDetailsPage(driver);
    HomePage homepage = new HomePage(driver);

    @When("he user click the Products link")
    public void he_user_click_the_products_link() {
        homepage.ProductLinkClick();
    }
    @Then("the user verify that the Products page is visible successfully")
    public void the_user_verify_that_the_products_page_is_visible_successfully() {
        String RA = "ALL PRODUCTS";
        System.out.println("résultat attendu"+RA);
        String RO = product.IsProductPageDisplayed();
        System.out.println("résultat obtenu"+RO);
        Assert.assertEquals(RA, RO, "Verify that login page is visible");
    }
    @Then("the product list product is display")
    public void the_product_list_product_is_display() {
        product.IsProductListDisplayed();
        System.out.println("La liste des produits sont bien affichée");

    }
    @When("The user selects a product by clicking the View Product link")
    public void the_user_selects_a_product_by_clicking_the_view_product_link() {
        product.ClickViewProductLink();
        System.out.println("le lien view product est cliqué avec succés");

    }
    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        productdetails.IsProductDetailsDisplay();
        System.out.println("la page de détails produit est bien affiché");

    }



}