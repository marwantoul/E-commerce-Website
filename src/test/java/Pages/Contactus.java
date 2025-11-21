package Pages;

import Base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Contactus extends BasePage {

    public Contactus(WebDriver driver) {
        super(driver);
    }

    By ContactUs = By.xpath("/html/body/div[1]/div[1]/div/div/h2");
    By username = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[1]/input");
    By useremail = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[2]/input");
    By subject = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[3]/input");
    By message = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[4]/textarea");
    By PieceJointe = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[5]/input");
    By SubmitButton = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[6]/input");
    By SuccessMessage = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]");

    public String isContactUsDisplayed() {

        String ContactusMessage = driver.findElement(ContactUs).getText();
        //System.out.println("résulat obtenu"+username);

        return ContactusMessage;
    }

        public void ContactUswithfullinformation(){
            driver.findElement(username).sendKeys("Test");
            driver.findElement(useremail).sendKeys("Test@ff.com");
            driver.findElement(subject).sendKeys("subject");
            driver.findElement(message).sendKeys("message");


            String filePath = "C:\\Users\\marwa.antoul\\Downloads\\18_11_2025_11_56_1017_Journal des caisses.pdf";
            File file = new File(filePath);
            if(file.exists()) {
                driver.findElement(PieceJointe).sendKeys(filePath);
            } else {
                System.out.println("Fichier introuvable : " + filePath);
            }

        }

        public void SubmitClic () {
            driver.findElement(SubmitButton).click();

        }

    public void handleConfirmationPopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println("Popup text: " + alert.getText());
        alert.accept(); // Cliquer sur OK
    }

    public String getSuccessMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessMessage));
        return successMessage.getText();
    }

    }




