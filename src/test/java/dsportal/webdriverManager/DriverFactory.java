package dsportal.webdriverManager;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class DriverFactory {
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	private static Logger logger= LogManager.getLogger(DriverFactory.class);
	
	    public  WebDriver init_driver(String browser) {
	    	logger.info("The browser value is "+browser);
	    	if (browser.equalsIgnoreCase("chrome")) {
	    		ChromeOptions options = new ChromeOptions();
	    		options.addArguments("--headless");
	    		tlDriver.set(new ChromeDriver(options));
	    	}
	    
	    	else if (browser.equalsIgnoreCase("firefox")) {	    		
	    		FirefoxOptions options = new FirefoxOptions();
	    		options.addArguments("--headless");
	    		tlDriver.set(new FirefoxDriver(options));
	    	}
	    
	    	else if (browser.equalsIgnoreCase("edge")) {
	    		EdgeOptions options = new EdgeOptions();
	    		options.addArguments("--headless");
	    		tlDriver.set(new EdgeDriver(options));
	    	}
	    	
	    	getDriver().manage().deleteAllCookies();
	    	getDriver().manage().window().maximize();
	    	getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	
	    return getDriver();
	    }

	    public static synchronized WebDriver getDriver() {
	        return tlDriver.get();
	    }
}
