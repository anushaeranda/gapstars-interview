import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageobject.BasePage;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @Developer: Anusha Eranda
 * Functions: select the checkboxes
 * */

public class CheckBoxes extends BasePage {

    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    @Test
    public void checkBoxes() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]")).click();
            List<WebElement> checkBoxElements = driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));
            for (WebElement checkbox : checkBoxElements) {
                LOGGER.info("is this selected : " + checkbox.isSelected());
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }
                Thread.sleep(6000);
            }

            quitDrivers();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "An exception was thrown", e);
        }
    }

}
