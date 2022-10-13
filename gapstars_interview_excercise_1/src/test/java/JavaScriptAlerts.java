
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.BasePage;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.logging.Logger;

/*
* @Developer: Anusha Eranda
* Functions: Click the JavaScript Alert link/Click for JS Confirm button/Click JS Prompt button
* */


public class JavaScriptAlerts extends BasePage {

    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    @Test
    public void javaScriptAlerts() throws InterruptedException {

        // Click the JavaScript Alert link
        driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")).click();

        //Click the "Click JS Alert button" & Accept the Alert
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        waitForAlertToPresent(driver);
        acceptAlert(driver);

        //Click the "Click for JS Confirm" button & Accept the Alert
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        waitForAlertToPresent(driver);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        //Click the "Click JS Prompt button" & Accept the Alert
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        Thread.sleep(3000);
        waitForAlertToPresent(driver);
        alert.sendKeys("hello I am Anusha Eranda");
        Thread.sleep(3000);
        alert = driver.switchTo().alert();
        alert.accept();
        LOGGER.info(driver.findElement(By.xpath("//p[@id='result']")).getText());
        Thread.sleep(3000);
        quitDrivers();
    }

    /*
    *  waitForAlertToPresent
    */

    public static void waitForAlertToPresent(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    /*
    * accept the Alert
    */
    public static void acceptAlert(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
