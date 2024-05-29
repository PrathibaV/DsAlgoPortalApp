package dsportal.webdriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	    public  WebDriver init_driver(String browser) {
	    	System.out.println("browser value is : "+ browser);
	    	if (browser.equalsIgnoreCase("chrome")) {
	    		tlDriver.set(new ChromeDriver());
	    	}
	    
	    	else if (browser.equalsIgnoreCase("firefox")) {
	    		tlDriver.set(new FirefoxDriver());
	    	}
	    
	    	else if (browser.equalsIgnoreCase("edge")) {
	    		tlDriver.set(new EdgeDriver());
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
