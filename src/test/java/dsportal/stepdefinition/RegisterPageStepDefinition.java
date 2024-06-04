
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

public class RegisterPageStepDefinition {
			
	HomePagePF homePagePF = new HomePagePF(DriverFactory.getDriver());
	RegisterPagePF registerPagePF = new RegisterPagePF(DriverFactory.getDriver());
	SignInPagePF signInPagePF=new SignInPagePF(DriverFactory.getDriver());
	ExcelReader excelReader = new ExcelReader(DriverFactory.getDriver());
	Helper helper = new Helper (DriverFactory.getDriver());
	public static String username;
	public static String password;
	public static String confirmPassword;
	public static String message;
	

//username reuired
@Given("user is in register page")
public void UserIsRedirectedToRegisterPage() {
	homePagePF.clickRegister();
}
@And("user did not enter any username {string} and {int}")
public void user_did_not_enter_any_username_register_page(String sheetname, Integer rownum) throws IOException  {
	LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);	
	this.password = testData.get("Password");
	this.confirmPassword = testData.get("ConfirmPassword");
	this.message = testData.get("Message");
	registerPagePF.enterPassword(password);
	registerPagePF.enterConfirmPassword(confirmPassword);
}
@When("user clicks Register link")
public void UserClicksRegisterLink()
{registerPagePF.clickRegisterButton();}

@Then("user should see error message")
public void user_should_see_error_message() {
String attributeMessage=registerPagePF.getUsernameAttributeMessage();
 Assert.assertEquals(attributeMessage,"Please fill in this field.");
}	

//Password Required
@Given("user enters only username and confirmPassword {string} and {int}")
public void user_enter_valid_username_and_confirmPassword(String sheetname, Integer rownum) throws IOException  {
	LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);	
	this.username = testData.get("Username");
	this.confirmPassword = testData.get("ConfirmPassword");
	registerPagePF.enterUsername(username);
	registerPagePF.enterConfirmPassword(confirmPassword);
}

@When("user clicks Register link again")
public void user_clicks_Register_link() {
	registerPagePF.clickRegisterButton();
}

@Then("user should see error message on password")
public void user_should_see_errorMessage() {
	String attributeMessage=registerPagePF.getPasswordAttributeMessage();
	 Assert.assertEquals(attributeMessage,"Please fill in this field.");
    
}

//Confirm Password required

@Given("user does not enter any password confirmation {string} and {int}")
public void user_does_not_enter_any_password_confirmation_and(String sheetname, Integer rownum) throws IOException {
	LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);	
	this.username = testData.get("Username");
	this.password = testData.get("Password");
	registerPagePF.enterUsername(username);
	registerPagePF.enterPassword(password);
}

@When("user clicks Register link third testcase")
public void user_clicks_register_link_third_testcase() {
	registerPagePF.clickRegisterButton();
}

@Then("user should see error message on confirm password")
public void user_should_see_error_message_on_confirm_password() {
String attributeMessage=registerPagePF.getConfirmPasswordAttributeMessage();
Assert.assertEquals(attributeMessage,"Please fill in this field.");
   
}

//invalid username

@Given("user enters invalid username but valid password and confirmPassword {string} and {int}")
public void user_enters_invalid_username_but_valid_password_and_confirm_password(String sheetname, Integer rownum) throws IOException {
	LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);	
	this.username = testData.get("Username");
	this.password = testData.get("Password");
	this.confirmPassword = testData.get("ConfirmPassword");
	registerPagePF.enterUsername(username);
	registerPagePF.enterPassword(password);
	registerPagePF.enterConfirmPassword(confirmPassword);
}

@When("user clicks Register link for invalid username testcase")
public void user_clicks_register_link_for_invalid_username_testcase() {
	registerPagePF.clickRegisterButton();
   
}

@Then("user should see error message Invalid username on register page")
public void user_should_see_error_message_invalid_username_on_register_page() {
	
		String attributeMessage=registerPagePF.getInvalidMessage();
		Assert.assertEquals("Please enter valid Username",attributeMessage);
}

//valid username but invalid password

@Given("user enters valid username but invalid password and confirmPassword {string} and {int}")
public void user_enters_valid_username_but_invalid_password_and_confirm_password(String sheetname, Integer rownum) throws IOException {
	LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);	
	this.username = testData.get("Username");
	this.password = testData.get("Password");
	this.confirmPassword = testData.get("ConfirmPassword");
	registerPagePF.enterUsername(username);
	registerPagePF.enterPassword(password);
	registerPagePF.enterConfirmPassword(confirmPassword);
}

@When("user clicks Register link for invalid pssword scenarios")
public void user_clicks_register_link_for_invalid_pssword_scenarios() {
	registerPagePF.clickRegisterButton();
}

@Then("user should see error message Invalid password on register page")
public void user_should_see_error_message_invalid_password_on_register_page() {
	String attributeMessage=registerPagePF.getInvalidMessage();
	Assert.assertEquals("Please enter a valid password",attributeMessage);

}

//pwd and confirm pwd is different

@Given("user enters valid username and valid but different password confirmPassword values {string} and {int}")
public void user_enters_valid_username_and_valid_but_different_password_confirm_password_values_and(String sheetname, Integer rownum) throws IOException  {
	LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);	
	this.username = testData.get("Username");
	this.password = testData.get("Password");
	this.confirmPassword = testData.get("ConfirmPassword");
	registerPagePF.enterUsername(username);
	registerPagePF.enterPassword(password);
	registerPagePF.enterConfirmPassword(confirmPassword);
}

@When("user clicks Register link for password mismatch scenario")
public void user_clicks_register_link_for_password_mismatch_scenario() {
	registerPagePF.clickRegisterButton();
}
    

//already registered user
@Then("user should see error message password and password confirmation doesnt match on register page")
public void user_should_see_error_message_password_and_password_confirmation_doesnt_match_on_register_page() {
	String attributeMessage=registerPagePF.getInvalidMessage();
	Assert.assertEquals(attributeMessage,"password_mismatch:The two password fields didn’t match.");
}

@Given("user enters valid username password confirmPassword values of an already registered user {string} and {int}")
public void user_enters_valid_username_password_confirm_password_values_of_an_already_registered_user_and(String sheetname, Integer rownum) throws IOException {
	LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);	
	this.username = testData.get("Username");
	this.password = testData.get("Password");
	this.confirmPassword = testData.get("ConfirmPassword");
	registerPagePF.enterUsername(username);
	registerPagePF.enterPassword(password);
	registerPagePF.enterConfirmPassword(confirmPassword);
}

@When("user clicks Register link for already registered user scenario")
public void user_clicks_register_link_for_already_registered_user_scenario() {
	registerPagePF.clickRegisterButton();
}



@Then("user should be able to see user already registered error message")
public void user_should_be_able_to_see_user_already_registered_error_message() {
	String attributeMessage=registerPagePF.getInvalidMessage();
	Assert.assertEquals("Username already exists",attributeMessage);

}

//valid user registration
@Given("user enters valid username,password,password confirmation values RegisterPage {string} and {int}")
public void user_enters_valid_username_password_password_confirmation_values_register_page(String sheetname, Integer rownum) throws IOException {
  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);
	this.username = testData.get("Username");
	this.password = testData.get("Password");
	this.confirmPassword = testData.get("ConfirmPassword");
	this.message=testData.get("Message");
	registerPagePF.enterUsername(username);
	registerPagePF.enterPassword(password);
	registerPagePF.enterConfirmPassword(password);
}

@When("user clicks Register")
public void user_clicks_register() {
	registerPagePF.clickRegisterButton();
 
}

@Then("user should be able to see  home page with success message")
public void user_should_be_able_to_see_home_page_with_message(){
	
	String successMessage=registerPagePF.getSuccessRegisterMessage();
	Assert.assertEquals(successMessage, message);
  
}

@And("the username displayed at the top right hand corner of the navigation bar")
public void the_username_displayed_at_the_top_right_hand_corner_of_the_navigation_bar() {
	String validUsername=signInPagePF.getUsername();
	   Assert.assertEquals(validUsername, username);
}

@Given("user is in Registration page")
public void user_is_in_registration_page() {
  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	homePagePF.clickSignOutLink();
	homePagePF.clickRegister();	
	}
	

@When("user clicks on Login link in register page")
public void UserClicksOnLoginLink()
{
	registerPagePF.clickLoginLink();
}

@Then("user is redirected to Login page")
public void UserIsRedirectedToLoginPage() {
	String pageTitle=helper.getPageTitle();
	Assert.assertEquals(pageTitle, "Login");
}
}
