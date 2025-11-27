package Steps;

import Factory.DriverFactory;
import Pages.CartPAge;
import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.ProductPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddproductsInCart {

    WebDriver driver = DriverFactory.getDriver();
    ProductPage product = new ProductPage(driver);
    CartPAge cartPAge = new CartPAge(driver);

    @When("The user select a first product and click Add to cart")
    public void the_user_select_a_first_product_and_click_Add_to_cart() {

        product.AddProductInCart();

        System.out.println("✅ Le Premier produit est ajouté dans le panier avec succès");

    }
    @When("the user Click Continue Shopping button")
    public void the_user_click_Continue_Shopping_button() {
        product.ContinueShoppingClick();
        System.out.println("l'utilisateur continue le shooping avec succés");
    }
    @Then("The user select a second product and click Add to cart")
    public void the_user_select_a_second_product_and_click_Add_to_cart() {

        product.AddProduct2InCart();
        System.out.println("✅ Deuxième produit est ajouté dans le panier avec succès");

    }

    @When("the user Click View Cart button")
    public void the_user_click_view_cart_button() {
        product.ClickViewCartBouton();
        System.out.println("Le view cart est cliqué avec succés");

    }
    @Then("the user Verify both products are added to Cart")
    public void the_user_verify_both_products_are_added_to_cart() {
        product.VerifyProductInCart();
        System.out.println("Les 2 produits sont bien ajoutés dans le panier");

    }
    @Then("the user Verify their prices, quantity and total price")
    public void the_user_verify_their_prices_quantity_and_total_price() {

        int itemCount = cartPAge.getItemCount();

        for (int i = 0; i < itemCount; i++) {
            double unitPrice = cartPAge.getItemUnitPrice(i);
            int quantity = cartPAge.getItemQuantity(i);
            double calculatedTotal = cartPAge.getItemCalculatedTotal(i);

            double expectedTotal = unitPrice * quantity;


            Assert.assertEquals(calculatedTotal, expectedTotal, 0.01, "Total price incorrect");
        }

    }
}