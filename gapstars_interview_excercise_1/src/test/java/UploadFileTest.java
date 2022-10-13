import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageobject.BasePage;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @Developer: Anusha Eranda
 * Functions: upload the file
 * */


public class UploadFileTest extends BasePage {

    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    @Test
    public void uploadFileTest() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).click();
            WebElement fileUploadLink = driver.findElement(By.cssSelector("input#file-upload"));
            fileUploadLink.sendKeys(readConfigurationFile().getProperty("FILE_UPLOAD_LINK"));
            WebElement uploadSubmit = driver.findElement(By.cssSelector("input[type='submit']"));
            uploadSubmit.click();
            Thread.sleep(6000);
            quitDrivers();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "An exception was thrown", e);
        }

    }

}
