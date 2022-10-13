import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageobject.BasePage;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @Developer: Anusha Eranda
 * Functions: select the dropdown1
 * */

public class Dropdown extends BasePage {


    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    @Test
    public void dropdown() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
            WebElement dropdown = driver.findElement(By.id("dropdown"));
            Select select = new Select(dropdown);
            select.selectByValue("1");
            Thread.sleep(6000);
            quitDrivers();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "An exception was thrown", e);
        }

    }

}
