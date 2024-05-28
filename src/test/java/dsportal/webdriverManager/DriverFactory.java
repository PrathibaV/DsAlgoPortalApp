package dsportal.webdriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
 private static WebDriver driver = null;
	
	    public static WebDriver getDriver() {
	        return driver;
	    }

	    public static WebDriver setDriver(WebDriver driver) {
	        return DriverManager.driver = driver;
	    }
}
