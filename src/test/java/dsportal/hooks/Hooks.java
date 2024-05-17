package dsportal.hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import dsportal.webdriverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	WebDriver driver = null;
	
	@Before ("@tag1")
public void launchBrowser () {
	 driver = new ChromeDriver();
			DriverManager.setDriver(driver);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://dsportalapp.herokuapp.com/");
	
}
	
	@After ("@tag2")
	public void tearDown() {
		//driver.quit();
		DriverManager.getDriver().quit();
		
	}
	
}
