package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.util.Properties;

/*
* @Developer: Anusha Eranda
* Function: Load the Config file
* */
public class UtilityDetails {
	
	public static Properties properties;
	public static String URL;
	public static final Logger logger = LogManager.getLogger();
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions action;
	public static WebDriverWait wait;
	protected Alert alert;

	
	public Properties readConfigurationFile() {
		properties = new Properties();
		try {
			properties.load(new FileInputStream("C:\\Users\\anusha_08426\\IdeaProjects\\gapstars_interview_excercise_1\\src\\test\\resources\\config\\config.properties"));
		} catch (Exception e) {			
			System.out.println("Error reading configuration file with exception :"+e);
		}
		return properties;
	}
}


