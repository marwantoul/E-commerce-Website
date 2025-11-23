package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    By MsgProductPage = By.xpath("//h2[normalize-space()='ALL PRODUCTS' or normalize-space()='All Products']");
    By ProductList = By.cssSelector(".features_items .product-image-wrapper");
    By viewProductLinkInCard = By.xpath(".//a[normalize-space()='View Product']");
    public String IsProductPageDisplayed () {

        String Messagesucces = driver.findElement(MsgProductPage).getText();

        return Messagesucces;
    }

    public void IsProductListDisplayed (){

        List<WebElement> products = driver.findElements(ProductList);
        org.junit.Assert.assertTrue("Aucun produit trouvé", products.size() > 0);

    }


    public void ClickViewProductLink() {
        List<WebElement> cards = driver.findElements(ProductList);
        Assert.assertTrue("Pas de produits pour cliquer", cards.size() > 0);
        WebElement first = cards.get(0);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", first);
        first.findElement(viewProductLinkInCard).click();
    }








}
