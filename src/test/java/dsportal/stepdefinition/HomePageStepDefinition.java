package dsportal.stepdefinition;
 
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import dsportal.pages.DataStructuresPF;
import dsportal.pages.HomePagePF;
import dsportal.utilities.Helper;
import dsportal.webdriverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {
	//private DriverFactory driverFactory = new DriverFactory();
	private HomePagePF homePagePF = new HomePagePF(DriverFactory.getDriver());
	private Helper helper = new Helper(DriverFactory.getDriver());
	private List<String> messages = new ArrayList<String>();
	private List<String> DsLink = new ArrayList<String>();

	@Given("User has navigated to the Home page")
	public void user_has_navigated_to_the_home_page() {
		homePagePF.getHomePageFromLp();
	}

	@Then("User should see Register link and Sign In link on the navigation bar")
	public void user_should_see_register_link_and_sign_in_link_on_the_navigation_bar() {		
		Assert.assertTrue(homePagePF.isRegisterLinkDisplayed());
		Assert.assertTrue(homePagePF.isSignInLinkDisplayed());
		/*
		 * String signInLink = homePagePF.getSignInlink();
		 * Assert.assertEquals(signInLink, "Sign in");
		 */

	}

	@When("User clicks on Get Started button under any of the data structure modules in the Home page")
	public void user_clicks_on_get_started_button_under_any_of_the_data_structure_modules_in_the_home_page() {
		for (int i = 0; i < homePagePF.getButtons().size(); i++) {
			homePagePF.clickGetStartedButton(i);
			messages.add(homePagePF.getMessage());
		}
	}

	@Then("User should see the message {string}")
	public void user_should_see_the_message(String message) {
		for (int i = 0; i < messages.size(); i++) {
			Assert.assertTrue(messages.get(i).contains(message));
		}
	}

	@When("User clicks Data Structure dropdown in the Home page")
	public void user_clicks_data_structure_dropdown_in_the_home_page() {
		homePagePF.clickDataStructureDD();
	}

	@When("User clicks any of the links from the dropdown.")
	public void user_clicks_any_of_the_links_from_the_dropdown() {
		for (int i = 0; i < homePagePF.getDataStructureList().size(); i++) {
			homePagePF.clickDsFromDropdown(i);
			DsLink.add(homePagePF.getMessage());
			homePagePF.clickDataStructureDD();
		}
	}

	@Then("User should see the alert message {string}")
	public void user_should_see_the_alert_message(String message) {
		for (int i = 0; i < DsLink.size(); i++) {
			Assert.assertTrue(DsLink.get(i).contains(message));
		}
	}

	@When("User logs into the portal with username {string} and password {string}")
	public void user_logs_into_the_portal_with_username_and_password(String userName, String passWord) {
		homePagePF.clickSignIn();// needs to be checked
		homePagePF.getLogin(userName, passWord);
	}

	@Then("User should see username {string} link and Sign Out {string} link on the navigation bar")
	public void user_should_see_userName_link_and_sign_out_link_on_the_navigation_bar(String userName, String signOut) {
		Assert.assertEquals(homePagePF.getUsernameLinkText(), userName);
		Assert.assertEquals(homePagePF.getSignOutLinkText(), signOut);
	}

	@When("User clicks Get Started button under dataStructure {string} in the Home page")
	public void user_clicks_get_started_button_under_dataStructure_in_the_home_page(String dataStructure) {
		homePagePF.getDsPage(dataStructure);
	}

	@Then("User should be navigated to the data structure page with title as {string}")
	public void user_should_be_navigated_to_the_data_structure_page_with_title_as(String pageTitle) {
		String currentPageTitle = helper.getPageTitle();
		Assert.assertEquals(currentPageTitle, pageTitle);
		
		//driver.navigate().back();
	}

	@Then("User navigates to Home page by clicking Numpy Ninja link")
	public void user_navigates_to_home_page_by_clicking_numpy_ninja_link() {
		homePagePF.getHomePage();
	}

	@When("User clicks the Data Structure dropdown in the Home page")
	public void user_clicks_the_data_structure_dropdown_in_the_home_page() throws InterruptedException {
		homePagePF.clickDataStructureDD();
		 //needs to be checked
	}

	@When("User clicks the Data Structure {string} link from the dropdown")
	public void user_clicks_the_data_structure_link_from_the_dropdown(String DataStructure) {
		
		try {
		
		for (int i = 0; i < homePagePF.getDataStructureList().size(); i++) {
			String DsLinkName = homePagePF.getDataStructureList().get(i).getText();
			 if (DsLinkName.equalsIgnoreCase(DataStructure)) {
				homePagePF.getDataStructureList().get(i).click();
				break;
			}
		}
	}
		catch(Exception E) {
			E.printStackTrace();
		}
		
		
	}

	@Then("User should navigate to the data structure page with title as {string}")
	public void user_should_navigate_to_the_data_structure_page_with_title_as(String PageTitle) {
		String currentPageTitle = helper.getPageTitle();
		Assert.assertEquals(currentPageTitle,PageTitle);
	}
	
	@Given("User is in the Home page")
	public void User_is_in_the_Home_page() {
		homePagePF.getHomePage();
	}
	
	@When("User clicks on Get Started button under Array {string} Data Structure")
	public void user_clicks_on_get_started_button_under_array_data_structure(String DataStructure) throws InterruptedException {
		homePagePF.getDsPage(DataStructure);
		Thread.sleep(10);
	}

	@When("User clicks on Numpy Ninja link on the navigation bar")
	public void user_clicks_on_numpy_ninja_link_on_the_navigation_bar() throws InterruptedException {
		homePagePF.clickNumpyNinjaLink();
		Thread.sleep(10);

	}

	@Then("User should be navigated to the Home page with the URL {string}")
	public void user_should_be_navigated_to_the_home_page_with_the_url(String url) {
		String pageUrl = helper.getPageUrl();
		Assert.assertTrue(pageUrl.equals(url));
	}

}
