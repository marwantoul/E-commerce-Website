package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPAge extends BasePage {

    public CartPAge(WebDriver driver) {
        super(driver);
    }


    By SubscriptionInput = By.id("susbscribe_email");
    By OKButton = By.id("subscribe");
    By SuccessMsg = By.xpath("//div[contains(text(),'You have been successfully subscribed!')]");
    private By cartTable = By.id("cart_info_table");
    private By cartTotalPrice = By.className("cart_total_price");
    private By cartQuantity = By.className("cart_quantity");

    public void EmailAdresseIsDisplayed(){
        WebElement emailInput = driver.findElement(SubscriptionInput);
        Assert.assertTrue("Le champ de recherche n'est pas affiché", emailInput.isDisplayed());

    }


    public void PutEmailAdresse (){

        driver.findElement(SubscriptionInput).sendKeys("Marwa@test.com");

    }

    public void ClickBoutonOK (){

        driver.findElement(OKButton).click();

    }

    public void SuccessMsgIsDisplayed(){

        WebElement emailInput = driver.findElement(SuccessMsg);
        Assert.assertTrue("Le message de succés n'est pas affiché", emailInput.isDisplayed());

    }


    public int getItemCount() {
        return driver.findElements(cartTotalPrice).size();
    }

    public double getItemUnitPrice(int itemIndex) {
        WebElement totalPriceElement = driver.findElements(cartTotalPrice).get(itemIndex);
        WebElement quantityElement = driver.findElements(cartQuantity).get(itemIndex);

        int quantity = Integer.parseInt(quantityElement.getText());
        String totalPriceText = totalPriceElement.getText().replace("Rs. ", "").replace(",", "").trim();
        double totalPrice = Double.parseDouble(totalPriceText);

        return totalPrice / quantity;
    }

    public double getItemCalculatedTotal(int itemIndex) {
        int quantity = Integer.parseInt(driver.findElements(cartQuantity).get(itemIndex).getText());
        return getItemUnitPrice(itemIndex) * quantity;
    }

    public int getItemQuantity(int itemIndex) {
        return Integer.parseInt(driver.findElements(cartQuantity).get(itemIndex).getText());
    }





}
