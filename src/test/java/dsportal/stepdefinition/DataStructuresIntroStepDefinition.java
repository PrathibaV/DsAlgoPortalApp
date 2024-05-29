package dsportal.stepdefinition; 

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import dsportal.pages.DataStructuresPF;
import dsportal.pages.EditorPagePF;
import dsportal.pages.DataStructuresIntroPagePF;
import dsportal.pages.HomePagePF;
import dsportal.utilities.ExcelReader;
import dsportal.utilities.Helper;
import dsportal.webdriverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructuresIntroStepDefinition {
	//private DriverFactory driverFactory = new DriverFactory();
	private HomePagePF homePagePF = new HomePagePF(DriverFactory.getDriver());
	private DataStructuresPF dataStructuresPF = new DataStructuresPF(DriverFactory.getDriver());
	private Helper helper = new Helper(DriverFactory.getDriver());	
	private ExcelReader excelReader = new ExcelReader(DriverFactory.getDriver());
	
	
	@Given("user is in the Data Structures-Introduction page")
	public void user_is_in_the_data_structures_introduction_page() {
		homePagePF.getDsPage("Data Structures-Introduction");	 
	}

	@When("user clicks on Time Complexity {string} link in Data Structures-Introduction page")
	public void user_clicks_on_time_complexity_link(String topicLink) {		
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("user should be redirected to Time Complexity page with title {string}")
	public void user_should_be_redirected_to_time_complexity_page(String pageTitle) {
		helper.windowHandlesToSwitchToIntroductionTopics();
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));	    
	}

	@When("user clicks on Practice Questions Link")
	public void user_clicks_on_practice_questions_link() {		
		dataStructuresPF.clickPracticeQuestionsLink();
	}

	@Then("user should be redirected to Practice Questions page with title {string}")
	public void user_is_redirected_to_practice_questions_page(String pageTitle) {
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));	    
	}

	@Given ("user is in Time Complexity page")
	public void user_is_in_time_complexity_page () {
		helper.goToPreviousPage();
	}
	@When("user clicks on Try Here button in the Time Complexity page")
	public void user_clicks_on_try_here_button_in_the_time_complexity_page() {
		dataStructuresPF.getTryEditorPage();	
	}





}
