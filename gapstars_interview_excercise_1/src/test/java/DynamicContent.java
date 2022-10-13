import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageobject.BasePage;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @Developer: Anusha Eranda
 * Functions: DynamicContent
 * */


public class DynamicContent extends BasePage {

    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    @Test
    public void dynamicContent() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//a[contains(text(),'Dynamic Content')]")).click();

            //To get direct descendants with 'row' class of div elements
            List<WebElement> dynamicContent = driver.findElements(By.cssSelector("div#content>div.row"));
            //To get the text from the 2nd row of dynamic content
            LOGGER.info(dynamicContent.get(1).findElement(By.cssSelector("div:nth-child(2)")).getText());
            Thread.sleep(6000);
            quitDrivers();

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "An exception was thrown", e);
        }
    }
}
