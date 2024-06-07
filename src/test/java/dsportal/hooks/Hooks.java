package dsportal.hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import dsportal.pages.HomePagePF;
import dsportal.utilities.ConfigReader;
import dsportal.utilities.Helper;
import dsportal.webdriverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	private WebDriver driver;
	private ConfigReader configReader;
	private DriverFactory driverFactory;
	private HomePagePF homePagePF;
	Properties prop;
	
	
	@Before ("@tag")
	public void launchBrowser(Scenario scenario) {
		configReader = new ConfigReader();
		prop= configReader.init_prop();
		String userName = prop.getProperty("username");
		String passWord = prop.getProperty("password");
		String portalUrl = prop.getProperty("url");
		String browserName = System.getProperty("browser") !=null ? System.getProperty("browser") : prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);		
			
		driver.get(portalUrl);
		if (Helper.isScenarioTaggedWith(scenario, "@tag1")) {		
			homePagePF = new HomePagePF(driver);
			homePagePF.getHomePageFromLp(); }
		
		if (Helper.isScenarioTaggedWith(scenario, "@tag2")) {
			homePagePF.clickSignIn(); 
			homePagePF.getLogin(userName, passWord); } 
	}
	
	@After ("@tag3")
	public void quitBrowser() {
		DriverFactory.getDriver().quit();
	}
}