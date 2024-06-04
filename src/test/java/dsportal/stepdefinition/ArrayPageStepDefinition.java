package dsportal.stepdefinition;

import java.io.IOException;
import java.util.LinkedHashMap;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;


import dsportal.pages.DataStructuresPagePF;
import dsportal.pages.EditorPagePF;
import dsportal.webdriverManager.DriverFactory;
import dsportal.utilities.Helper;
import dsportal.utilities.ExcelReader;
import dsportal.pages.HomePagePF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import dsportal.pages.PracticeQuestionsPagePF;

public class ArrayPageStepDefinition {
	private HomePagePF homePagePF = new HomePagePF(DriverFactory.getDriver());
	private DataStructuresPagePF dataStructuresPF = new DataStructuresPagePF(DriverFactory.getDriver());
	private Helper helper = new Helper(DriverFactory.getDriver());
	private EditorPagePF editorPagePF = new EditorPagePF(DriverFactory.getDriver());
	private ExcelReader excelReader = new ExcelReader(DriverFactory.getDriver());
	private String expectedOutput = null;
	private String expectedMessage = null;
	private PracticeQuestionsPagePF practiceQuestionsPagePF=new PracticeQuestionsPagePF(DriverFactory.getDriver());
	
	@Given("User is in Array page")
	public void user_is_in_array_page() {
		homePagePF.getDsPage("Array");
	}

	@When("User clicks on Arrays in python {string} link in Array page")
	public void user_clicks_on_arrays_in_python_link_in_array_page(String topicLink) throws InterruptedException {
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to  Array in Python page with title {string}")
	public void user_should_be_navigated_to_array_in_python_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToArrayTopic();
		helper.waitForPageTitle(pageTitle);
		Assert.assertEquals(helper.getPageTitle(), pageTitle);
	}

	@When("User clicks Try Here button in Arrays in python page")
	public void user_clicks_try_here_button_in_arrays_in_python_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(),700);
		dataStructuresPF.getTryEditorPage();
	}


	@When("User enters valid python code in the textBox from the given sheetname {string} and rownumber {int}")
	public void user_enters_valid_python_code_in_the_textBox_from_the_given_sheetname_and_rownumber(String sheetname,
			Integer rownum) throws IOException, InterruptedException {
		LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);
		String pythonCode = testData.get("PythonCode");
		String expectedOutput = testData.get("Output");
		editorPagePF.enterPythonCode(pythonCode);
		this.expectedOutput = expectedOutput;

	}

	@When("User clicks on Run button")
	public void user_clicks_on_run_button() throws InterruptedException {
		editorPagePF.clickRunButton();
	}

	@Then("User should see the output in the console of tryEditor page")
	public void user_should_see_the_output_in_the_console_of_tryeditor_page() {
		String actualOutput = editorPagePF.getCodeOutput();
		Assert.assertEquals(actualOutput, expectedOutput);
	}

	@Given("User has cleared the textbox in tryEditor page")
	public void user_has_cleared_the_textbox_in_try_editor_page() {
		helper.clearEditorBox();
	}

	@When("User enters invalid python code in the textBox from the given sheetname {string} and rownumber {int}")
	public void user_enters_invalid_python_code_in_the_textBox_from_the_given_sheetname_and_rownumber(String sheetname,
			Integer rownum) throws IOException, InterruptedException {
		LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);
		String pythonCode = testData.get("PythonCode");
		String expectedOutput = testData.get("Output");
		String expectedMessage = testData.get("ExpectedMessage");
		editorPagePF.enterPythonCode(pythonCode);
		this.expectedMessage = expectedMessage;

	}

	
	@Then("User should see an alert popup with the error message")
	public void user_should_see_an_alert_popup_with_the_error_message() throws InterruptedException {
		String actualAlertMessage = helper.getAlertMessageText();
		Assert.assertEquals(actualAlertMessage,expectedMessage);
	}

	@Then("User clicks Ok button in the Alert popup")
	public void user_clicks_ok_button_in_the_alert_popup() {
		helper.closeAlert();
	}


	@Given("User has navigated to Array page")
	public void user_has_navigated_to_array_page() {
		helper.closeArrayTopic();
		helper.switchToArrayPage();
	}

	@When("User clicks on Arrays Using List {string} link in Array page")
	public void user_clicks_on_arrays_using_list_link_in_array_page(String topicLink) throws InterruptedException {
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Arrays Using List page with title {string}")
	public void user_should_be_navigated_to_arrays_using_list_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToArrayTopic();
		helper.waitForPageTitle(pageTitle);
		Assert.assertEquals(helper.getPageTitle(), pageTitle);
	}

	@When("User clicks Try Here button in Arrays Using List page")
	public void user_clicks_try_here_button_in_arrays_using_list_page() throws InterruptedException {
		helper.scrollDownByLength(DriverFactory.getDriver(),700);
		dataStructuresPF.getTryEditorPage();
	}

	
	@When("User clicks on Basic Operations in Lists {string} link in Array page")
	public void user_clicks_on_basic_operations_in_lists_link_in_array_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Basic Operations in Lists page with title {string}")
	public void user_should_be_navigated_to_basic_operations_in_lists_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToArrayTopic();
		helper.waitForPageTitle(pageTitle);
		Assert.assertEquals(helper.getPageTitle(), pageTitle);
	}

	@When("User clicks Try Here button in Basic Operations in Lists page")
	public void user_clicks_try_here_button_in_basic_operations_in_lists_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(),700);
		dataStructuresPF.getTryEditorPage();
	}


	@When("User clicks on Applications of Array {string} link in Array page")
	public void user_clicks_on_applications_of_array_link_in_array_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Applications of Array page with title {string}")
	public void user_should_be_navigated_to_applications_of_array_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToArrayTopic();
		helper.waitForPageTitle(pageTitle);
		Assert.assertEquals(helper.getPageTitle(), pageTitle);
	}

	@When("User clicks Try Here button in Applications of Array page")
	public void user_clicks_try_here_button_in_applications_of_array_page() throws InterruptedException {
		dataStructuresPF.getTryEditorPage();
	}
//***********PRACTICE************************888

	@When("User clicks on Practice Questions link in Applications of Array page")
	public void user_clicks_on_practice_questions_link_in_applications_of_array_page() {
		dataStructuresPF.getApplicationsofArray();
		practiceQuestionsPagePF.getPracticeQuestions();	    
	}

	@Then("User should be navigated to Practice Questions page with title {string}")
	public void user_should_be_navigated_to_practice_questions_page_with_title(String pageTitle) {
		Assert.assertEquals(helper.getPageTitle(), pageTitle);	    
	}
	
	@When("User clicks  in Search the array link")
	public void user_clicks_in_search_the_array_link() {
		practiceQuestionsPagePF.getSearchtheArray(); 	    
	}

	@Then("User should be navigated to Practice Questions Editor page with title {string}")
	public void user_should_be_navigated_to_practice_questions_editor_page_with_title(String pageTitle) {
		Assert.assertEquals(helper.getPageTitle(), pageTitle);
	    
	}

	@Given("User has cleared the Editor box in Assessment page")
	public void user_has_cleared_the_editor_box_in_assessment_page() throws InterruptedException {
		Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
		practiceQuestionsPagePF.getTextArea().sendKeys(Keys.chord(cmdCtrl,"a", Keys.DELETE));
	}

	@When("User enters valid python code in the Editor box from the given sheetname {string} and rownumber {int}")
	public void user_enters_valid_python_code_in_the_editor_box_from_the_given_sheetname_and_rownumber(String sheetname, Integer rownum) throws IOException  {
		LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);
		String pythonCode = testData.get("PythonCode");
		String expectedOutput = testData.get("Output");
		practiceQuestionsPagePF.getPythonEditor(pythonCode);
		this.expectedOutput = expectedOutput;

	}

	@When("User clicks Run button in Assessment Page")
	public void user_clicks_run_button_in_assessment_page() {
		practiceQuestionsPagePF.clickEditorRunButton();	    
	}

	@Then("User should see the output in the console in Assessment Page")
	public void user_should_see_the_output_in_the_console_in_assessment_page() {	    
		String actualOutput = practiceQuestionsPagePF.getOutput();
		Assert.assertEquals(actualOutput, expectedOutput);
	}
	
	@Given("User clicks the Editor box and has cleared the Editor box in Assessment page")
	public void user_clicks_the_editor_box_and_has_cleared_the_editor_box_in_assessment_page() throws InterruptedException {
		helper.clearEditorBox();
		Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
		practiceQuestionsPagePF.getTextArea().sendKeys(Keys.chord(cmdCtrl,"a", Keys.DELETE));
	}


	@When("User enters invalid python code in the Editor box from the given sheetname {string} and rownumber {int}")
	public void user_enters_invalid_python_code_in_the_editor_box_from_the_given_sheetname_and_rownumber(String sheetname, Integer rownum) throws IOException  {
		LinkedHashMap<String, String> testData = excelReader.getTestData(sheetname, rownum);
		String pythonCode = testData.get("PythonCode");
		String expectedOutput = testData.get("Output");
		String expectedMessage = testData.get("ExpectedMessage");
		practiceQuestionsPagePF.getPythonEditor(pythonCode);
		this.expectedMessage = expectedMessage;
	    
	}

	@Then("User should see an alert box with the error message in Assessment Page")
	public void user_should_see_an_alert_box_with_the_error_message_in_assessment_page() throws InterruptedException {
		String actualAlertMessage = practiceQuestionsPagePF.getErrorMessageText();
		Assert.assertEquals(actualAlertMessage,expectedMessage);	    
	}

	@Then("User clicks Ok button in Alert in Assessment Page")
	public void user_clicks_ok_button_in_alert_in_assessment_page() throws InterruptedException {
		practiceQuestionsPagePF.closeAlert();
	}

	@Given("User is in Practice Questions page")
	public void user_is_in_practice_questions_page() throws InterruptedException {
		practiceQuestionsPagePF.goBack();	    
	}

	@When("User clicks  in Max Consecutive Ones link")
	public void user_clicks_in_max_consecutive_ones_link() throws InterruptedException {
		practiceQuestionsPagePF.getMaxConsecutiveOnes();    
	}

	@When("User clicks  in Find Numbers with Even Number of Digits link")
	public void user_clicks_in_find_numbers_with_even_number_of_digits_link() throws InterruptedException {
		practiceQuestionsPagePF.getFindNumberswithEvenNumberofDigits();	    
	}

	@When("User clicks in Squares of a Sorted Array link")
	public void user_clicks_in_squares_of_a_sorted_array_link() {
		practiceQuestionsPagePF.getSquaresofaSortedArray();	    
	}
	
}
