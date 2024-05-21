package dsportal.hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import dsportal.pages.HomePagePF;
import dsportal.utilities.Helper;
import dsportal.webdriverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	WebDriver driver = null;
	String userName = "TechTitans";
	String passWord = "TT1234$#@!";
	
	@Before ("@tag1")
public void setUp (Scenario scenario) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
	 driver = new ChromeDriver(options);
			DriverManager.setDriver(driver);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://dsportalapp.herokuapp.com/");
	HomePagePF homePagePF = new HomePagePF(driver);
	homePagePF.getHomePageFromLp();
	
	if (Helper.isScenarioTaggedWith(scenario, "@tag2")) {
        homePagePF.clickSignIn();
        homePagePF.getLogin(userName, passWord);
    }
}
	
	/*
	 * @Before ("@tag2") (order=2) public void userLogin () {
	 * homePagePF.clickSignIn();// needs to be checked homePagePF.getLogin(userName,
	 * passWord); }
	 */
	
	@After ("@tag3")
	public void tearDown() {
		//driver.quit();
		DriverManager.getDriver().quit();
		
	}
	
}
