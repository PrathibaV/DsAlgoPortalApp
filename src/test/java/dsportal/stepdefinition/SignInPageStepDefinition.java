
package dsportal.stepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import dsportal.pages.HomePagePF;
import dsportal.pages.RegisterPagePF;
import dsportal.pages.SignInPagePF;
import dsportal.utilities.ExcelReader;
import dsportal.utilities.Helper;
import dsportal.webdriverManager.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SignInPageStepDefinition {
	
	HomePagePF homePagePF = new HomePagePF(DriverFactory.getDriver());
	SignInPagePF signInPagePF = new SignInPagePF(DriverFactory.getDriver());
	RegisterPagePF registerPagePF=new RegisterPagePF(DriverFactory.getDriver());
	ExcelReader excelReader = new ExcelReader(DriverFactory.getDriver());
	Helper helper = new Helper (DriverFactory.getDriver());
	public static String username;
	public static String password;

	
	@Given("user is in the login page")
	public void user_is_in_the_login_page() {
	homePagePF.clickSignIn();
		
	}

	@When("user enters valid testdata {string} and {int}")
	public void user_enters_validtestData(String sheetname, Integer rownum) throws IOException {
		LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);
		this.username=testData.get("Username");
		this.password=testData.get("Password");
	
		signInPagePF.enterUsername(username);
		signInPagePF.enterPassword(password);	  
	}

	@And("user clicks on Login button")
	public void user_clicks_on_login_button1() {
		signInPagePF.clickloginButton();	  
	}

	@Then("user is redirected to home page")
	public void user_is_redirected_to_home_page() {
	   String pageTitle=helper.getPageTitle();
	   Assert.assertEquals(pageTitle,"NumpyNinja");
	}

	@And("username should be displayed in the right hand side corner of homepage")
	public void username_should_be_displayed_in_the_right_hand_side_corner_of_homepage() {
	   String validUsername=signInPagePF.getUsername();
	   Assert.assertEquals(validUsername, username);
	}
	
	@And("user ushould be able to see message")
	public void userShouldBeAbleToSeeMessage() {		
		String message = signInPagePF.getSuccessMessage();
		Assert.assertEquals(message,"You are logged in");		
	}
	
	//username required
		@Given("user is redirected the login page")
		public void UserIsInTheLoginPage() {
			homePagePF.clickSignOutLink();
			homePagePF.clickSignIn();
			
		}
		@When("user clicks on login button without giving any values")
		public void user_clicks_on_login_button_without_giving_any_values() {
			signInPagePF.clickloginButton();		   
		}

		@Then("user should see error message on username textbox")
		public void UserSeeAlertBoxAndUserStaysInLoginPage() {
		String attributeMessage=signInPagePF.getUsernameAttributeMessage();
		Assert.assertEquals(attributeMessage,"Please fill out this field.");
		String pageTitle=helper.getPageTitle();
		Assert.assertEquals(pageTitle,"Login");		 
		}

//password required

		@When("user enters valid username but no password")
		public void user_enters_only_username()  {
			signInPagePF.enterUsername(username);
		}

		@When("user clicks on login button without giving any values for password")
		public void user_clicks_on_login_button() {
			signInPagePF.clickloginButton();		    
		}

		@Then("user should see error message-Please fill out this field message on password textbox and should stay in the same page")
		public void UserSeeErrorMessageAndStayInLoginPage() {
			String attributeMessage=signInPagePF.getpasswordAttributeMessage();
			Assert.assertEquals(attributeMessage,"Please fill out this field.");			
		}
		
//register link
				
		@When("user clicks on Register! link from the Login page")
		public void user_clicks_on_register_link_from_the_login_page() {
			signInPagePF.clickRegisterFromLoginPage();		
		}

		@Then("user is redirected to register page")
		public void user_is_redirected_to_register_page() {
			 String pageTitle=helper.getPageTitle();
			   Assert.assertEquals(pageTitle,"Registration");  
			
			   homePagePF.clickSignIn();
		}

//invalid scenario
	
		@And("user enters invalid username and password from {string} and {int}")
		public void user_enters_InvalidUserNamePassword(String sheetname, Integer rownum) throws IOException{
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);
			this.username = testData.get("Username");
			this.password = testData.get("Password");
			
			
			signInPagePF.enterUsername(username);
			signInPagePF.enterPassword(password);
			
		}

		@When("user clicks Login button")
		public void user_clicks_login_button() {
			signInPagePF.clickloginButton();		    
		}

		@Then("user should see error message Invalid Username and Password")
		public void user_should_see_error_message_invalid_username_and_password() {			
			String message = signInPagePF.getInvalidMessage();
			Assert.assertEquals(message,"Invalid Username and Password");		   
		}
}
