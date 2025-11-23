package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends BasePage {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    By productInformation = By.cssSelector(".product-information");


    public void IsProductDetailsDisplay() {
        WebElement info = driver.findElement(productInformation);
        Assert.assertTrue("Bloc détail produit non visible", info.isDisplayed());
    }
}
