package pageobject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import util.JavaScriptActions;
import util.UtilityDetails;

/*
*@Developer: Anusha Eranda
*Function: read the config file pass that parameters "initializeDriver" Method
* */


public abstract class BasePage extends UtilityDetails {

	@BeforeMethod
	public void initializeDriver() throws NoSuchFieldException {

		URL = readConfigurationFile().getProperty("BASE_URL");
		if(URL.trim().length() > 0){
			String browserName = readConfigurationFile().getProperty("BROWSER_NAME");
				if (browserName.trim().equalsIgnoreCase("firefox")) {
					System.setProperty(readConfigurationFile().getProperty("FIREFOX_DRIVER_KEY"),readConfigurationFile().getProperty("FIREFOX_DRIVER_PATH"));
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					initObjects();
				}else if (browserName.trim().equalsIgnoreCase("chrome")) {
					System.setProperty(readConfigurationFile().getProperty("CHROME_DRIVER_KEY"),readConfigurationFile().getProperty("CHROME_DRIVER_PATH"));
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					initObjects();
				}else {
					System.out.println("Invalid BrowserName");
					throw new IllegalStateException("Failed to invoke WebBrowser.Invalid BrowserName..");
				}
			}
		driver.get(URL);
		}

	/*****************************************************************************************************************/
	@AfterTest
	public void quitDrivers() {
		driver.quit();

	}

	/*Initialize objects of JS, jsActions, Actions and WindowActions classes*/
	public void initObjects() {
		js = (JavascriptExecutor) driver;
		JavaScriptActions jsActions = new JavaScriptActions();
		action = new Actions(driver);
	}
}
/*****************************************************************************************************************/
