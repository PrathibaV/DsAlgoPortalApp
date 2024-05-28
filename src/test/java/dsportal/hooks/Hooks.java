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
	String userName = "TechTitans";
	String passWord = "TT1234$#@!";
	
	@Before ("@tag1")
	public void launchBrowser(Scenario scenario) {
		configReader = new ConfigReader();
		prop= configReader.init_prop();
		String browserName= prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		driver.get("https://dsportalapp.herokuapp.com/");
		homePagePF = new HomePagePF(driver);
		homePagePF.getHomePageFromLp();
		if (Helper.isScenarioTaggedWith(scenario, "@tag2")) {
			homePagePF.clickSignIn(); 
			homePagePF.getLogin(userName, passWord); } 
	}
	
	@After ("@tag3")
	public void quitBrowser() {
		DriverFactory.getDriver().quit();
	}
	
	/*
	 * @Before ("@tag1") public void setUp (Scenario scenario) { ChromeOptions
	 * options = new ChromeOptions(); options.addArguments("--incognito"); driver =
	 * new ChromeDriver(options); DriverManager.setDriver(driver);
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 * driver.get("https://dsportalapp.herokuapp.com/"); HomePagePF homePagePF = new
	 * HomePagePF(driver); homePagePF.getHomePageFromLp();
	 * 
	 * if (Helper.isScenarioTaggedWith(scenario, "@tag2")) {
	 * homePagePF.clickSignIn(); homePagePF.getLogin(userName, passWord); } }
	 * 
	 * 
	 * @Before ("@tag2") (order=2) public void userLogin () {
	 * homePagePF.clickSignIn();// needs to be checked homePagePF.getLogin(userName,
	 * passWord); }
	 * 
	 * 
	 * @After ("@tag3") public void tearDown() { //driver.quit();
	 * DriverManager.getDriver().quit();
	 * 
	 * }
	 */
}
