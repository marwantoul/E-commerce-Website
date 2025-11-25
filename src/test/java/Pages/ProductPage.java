package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BasePage {


    private List<String> productNames = new ArrayList<>();
    private List<Double> productPrices = new ArrayList<>();


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    By MsgProductPage = By.xpath("//h2[normalize-space()='ALL PRODUCTS' or normalize-space()='All Products']");
    By ProductList = By.cssSelector(".features_items .product-image-wrapper");
    By viewProductLinkInCard = By.xpath(".//a[normalize-space()='View Product']");
    By ProductSearchInput = By.id("search_product");
    By ProductSearchSubmit = By.id("submit_search");
    By AddToCart1Bouton = By.xpath("//a[@data-product-id='2']");
    By AddToCart2Bouton = By.xpath("//a[@data-product-id='3']");
    By ContinueShopBouton = By.xpath("//button[normalize-space()='Continue Shopping']");
    By ViewCartBouton = By.xpath("//a[contains(@href,'/view_cart') and contains(.,'View Cart')]");
    By CartTable = By.id("cart_info_table");
    By CartTableLigne = By.cssSelector("#cart_info_table tbody tr");



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
        first.findElement(viewProductLinkInCard).click();
    }

    public void ProductSearch(String Producname){

        driver.findElement(ProductSearchInput).sendKeys(Producname);
        driver.findElement(ProductSearchSubmit).click();

    }

    public void ResultProductSearch(String Producname){

        // Récupérer la liste des produits
        List<WebElement> products = driver.findElements(ProductList);
        Assert.assertTrue("Aucun produit trouvé", products.size() > 0);

        boolean found = false;
        System.out.println("Produits contenant '" + Producname + "' :");
        for (WebElement product : products) {
            String name = product.findElement(By.cssSelector(".productinfo p")).getText().trim();
            if (name.toLowerCase().contains(Producname.toLowerCase())) {
                System.out.println("- " + name);
                found = true;
            }
        }

        // Vérifier qu'au moins un produit correspond
        Assert.assertTrue("Aucun produit ne contient le mot-clé '" + Producname + "'", found);
    }

    public void AddProductInCart() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(AddToCart1Bouton));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", addBtn);
        addBtn.click();


    }

    public void AddProduct2InCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(AddToCart2Bouton));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", addBtn);
        addBtn.click();


    }



    public void ContinueShoppingClick(){

        driver.findElement(ContinueShopBouton).click();

    }

    public void ClickViewCartBouton (){

        driver.findElement(ViewCartBouton).click();

    }

    public void VerifyProductInCart (){


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(CartTable));

        List<WebElement> products = driver.findElements(CartTableLigne);
        Assert.assertEquals("Le panier ne contient pas 2 produits", 2, products.size());
    }




}













