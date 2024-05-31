package dsportal.stepdefinition;

import java.io.IOException; 
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;

import dsportal.pages.DataStructuresPF;
import dsportal.pages.EditorPagePF;
import dsportal.pages.HomePagePF;
import dsportal.pages.StackPagePF;
import dsportal.utilities.ExcelReader;
import dsportal.utilities.Helper;
import dsportal.webdriverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stackPageStepDefinition {

	private HomePagePF homePagePF = new HomePagePF(DriverFactory.getDriver());
	private DataStructuresPF dataStructuresPF = new DataStructuresPF(DriverFactory.getDriver());
	private Helper helper = new Helper(DriverFactory.getDriver());
	private EditorPagePF editorPagePF = new EditorPagePF(DriverFactory.getDriver());
	private ExcelReader excelReader = new ExcelReader(DriverFactory.getDriver());
	//private final Lock elementLock = new ReentrantLock();
	private String expectedOutput= null;
	private String expectedMessage= null;
	
	@Given("User is in Stack page")
	public void user_is_in_stack_page() {
		homePagePF.getDsPage("Stack");	    
	}

	@When("User clicks on Operations in Stack {string} link in Stack page")
	public void user_clicks_on_operations_in_stack_link_in_stack_page(String topicLink) {		
		dataStructuresPF.openTopicsPage(topicLink);	    
	}

	@Then("User should be navigated to Operations in Stack page with title {string}")
	public void user_should_be_navigated_to_operations_in_stack_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToStackTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks Try Here button in Operations in Stack page")
	public void user_clicks_try_here_button_in_operations_in_stack_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.getTryEditorPage();	    
	}

	@Then("User should be navigated to tryEditor page with title {string}")
	public void user_should_be_navigated_to_try_editor_page_with_title(String pageTitle) {
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));   
	}

	@When("User enters valid python code in the Editor from the given sheetname {string} and rownumber {int}")
	public void user_enters_valid_python_code_in_the_editor_from_the_given_sheetname_and_rownumber(String sheetname, Integer rownum) throws IOException, InterruptedException {
		LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);
		String pythonCode = testData.get("PythonCode");
		String expectedOutput = testData.get("Output");
		String expectedMessage = testData.get("ExpectedMessage"); 
		
			editorPagePF.enterPythonCode(pythonCode);
		
		/*
		 * excelReader.TextIndentation(4, 4); excelReader.TextIndentation(7, 10);
		 */
		this.expectedOutput = expectedOutput;
	}

	@When("User clicks Run button")
	public void user_clicks_run_button() {		
			editorPagePF.clickRunButton();		
	}

	@Then("User should see the output in the console")
	public void user_should_see_the_output_in_the_console() {		
		String actualOutput= editorPagePF.getCodeOutput();
	    Assert.assertEquals(actualOutput, expectedOutput);		
	}

	@Given("User has cleared the Editor box in tryEditor page")
	public void user_has_cleared_the_editor_box_in_try_editor_page() {		
		helper.clearEditorBox();		
	}

	@When("User enters invalid python code in the Editor from the given sheetname {string} and rownumber {int}")
	public void user_enters_invalid_python_code_in_the_editor_from_the_given_sheetname_and_rownumber(String sheetname, Integer rownum) throws IOException, InterruptedException {
		LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);
		String pythonCode = testData.get("PythonCode");
		String expectedOutput = testData.get("Output");
		String expectedMessage = testData.get("ExpectedMessage"); 
		
		editorPagePF.enterPythonCode(pythonCode);
		
		this.expectedMessage = expectedMessage;
	}

	@Then("User should see an alert box with the error message")
	public void user_should_see_an_alert_box_with_the_error_message() {		
		String actualAlertMessage= helper.getAlertMessageText();
		 Assert.assertEquals(actualAlertMessage, expectedMessage);		
	}

	@Then("User clicks Ok button in Alert")
	public void user_clicks_ok_button_in_alert() {		
		helper.closeAlert();		
	}

	@Given("User has navigated to Stack page")
	public void User_has_navigated_to_Stack_page () {
		helper.closeStackTopic();
		helper.switchToStackPage();
	}
	
	@When("User clicks on Implementation {string} link in Stack page")
	public void user_clicks_on_implementation_link_in_stack_page(String topicLink ) {
		dataStructuresPF.openTopicsPage(topicLink);   
	}

	@Then("User should be navigated to Implementation page with title {string}")
	public void user_should_be_navigated_to_implementation_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToStackTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));	    
	}

	@When("User clicks on Try Here button in Implementation page")
	public void user_clicks_on_try_here_button_in_implementation_page() {
		dataStructuresPF.getTryEditorPage();	    
	}

	@When("User clicks on Applications {string} link in Stack page")
	public void user_clicks_on_applications_link_in_stack_page(String topicLink) {
		dataStructuresPF.openTopicsPage(topicLink);	    

	}

	@Then("User should be navigated to Applications page with title {string}")
	public void user_should_be_navigated_to_applications_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToStackTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));	    
	}

	@When("User clicks on Try Here button in Applications page")
	public void user_clicks_on_try_here_button_in_applications_page() {
		dataStructuresPF.getTryEditorPage();	    
	}
	
	@When("User clicks on any of the topics {string} on Stack page")
	public void User_clicks_on_any_of_the_topics_on_Stack_page (String topic) {
		dataStructuresPF.openTopicsPage(topic);
		helper.windowHandlesToSwitchToStackTopics();
	}
	
}
