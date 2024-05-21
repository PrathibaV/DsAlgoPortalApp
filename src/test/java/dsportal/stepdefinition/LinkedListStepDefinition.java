package dsportal.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsportal.pages.CommonMethodsPF;
import dsportal.pages.HomePagePF;
import dsportal.utilities.Helper;
import dsportal.webdriverManager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListStepDefinition {

	WebDriver driver = DriverManager.getDriver();
	HomePagePF homePagePF = new HomePagePF(driver);
	CommonMethodsPF commonMethodsPF = new CommonMethodsPF(driver);
	Helper helper = new Helper (driver);

	
	@Given("User is in Linked List page")
	public void user_is_in_linked_list_page() {
		homePagePF.getDsPage("Linked List");
	}

	@When("User clicks on Introduction {string} link in Linked List page")
	public void user_clicks_on_introduction_link_in_linked_list_page(String topicLink) {
		commonMethodsPF.openTopicsPage(topicLink);	    
	}

	@Then("User should be navigated to Introduction page with title {string}")
	public void user_should_be_navigated_to_introduction_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTopics();
		Assert.assertTrue(commonMethodsPF.getPageTitle().equals(pageTitle));	    
	}

	@When("User clicks Try Here button in Introduction page")
	public void user_clicks_try_here_button_in_introduction_page() {
		commonMethodsPF.getTryEditorPage();		    
	}

	@Given("User has navigated to Linked List page")
	public void user_has_navigated_to_linked_list_page() {
		helper.closeTopic();
		helper.switchToDataStructurePage();	    
	}

	@When("User clicks on Creating Linked List {string} link in Linked List page")
	public void user_clicks_on_creating_linked_list_link_in_linked_list_page(String topicLink) {
		commonMethodsPF.openTopicsPage(topicLink); 	    
	}

	@Then("User should be navigated to Creating Linked List page with title {string}")
	public void user_should_be_navigated_to_creating_linked_list_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTopics();
		Assert.assertTrue(commonMethodsPF.getPageTitle().equals(pageTitle));	    
	}

	@When("User clicks on Try Here button in Creating Linked LIst page")
	public void user_clicks_on_try_here_button_in_creating_linked_list_page() {
		commonMethodsPF.getTryEditorPage();		    
	}

	@When("User clicks on Types of Linked List {string} link in Linked List page")
	public void user_clicks_on_types_of_linked_list_link_in_linked_list_page(String topicLink) {
		commonMethodsPF.openTopicsPage(topicLink);	    
	}

	@Then("User should be navigated to Types of Linked List page with title {string}")
	public void user_should_be_navigated_to_types_of_linked_list_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTopics();
		Assert.assertTrue(commonMethodsPF.getPageTitle().equals(pageTitle));	    
	}

	@When("User clicks on Try Here button in Types of Linked List page")
	public void user_clicks_on_try_here_button_in_types_of_linked_list_page() {
		commonMethodsPF.getTryEditorPage();		    
	}

	@When("User clicks on Implement Linked List in Python {string} link in Linked List page")
	public void user_clicks_on_implement_linked_list_in_python_link_in_linked_list_page(String topicLink) {
		commonMethodsPF.openTopicsPage(topicLink);	    
	}

	@Then("User should be navigated to Implement Linked List in Python page with title {string}")
	public void user_should_be_navigated_to_implement_linked_list_in_python_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTopics();
		Assert.assertTrue(commonMethodsPF.getPageTitle().equals(pageTitle));	    
	}

	@When("User clicks on Try Here button in Implement Linked List in Python page")
	public void user_clicks_on_try_here_button_in_implement_linked_list_in_python_page() {
		commonMethodsPF.getTryEditorPage();		    
	}

	@When("User clicks on Traversal {string} link in Linked List page")
	public void user_clicks_on_traversal_link_in_linked_list_page(String topicLink) {
		commonMethodsPF.openTopicsPage(topicLink);	    
	}

	@Then("User should be navigated to Traversal page with title {string}")
	public void user_should_be_navigated_to_traversal_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTopics();
		Assert.assertTrue(commonMethodsPF.getPageTitle().equals(pageTitle));	    
	}

	@When("User clicks on Try Here button in Traversal page")
	public void user_clicks_on_try_here_button_in_traversal_page() {
		commonMethodsPF.getTryEditorPage();		    
	}

	@When("User clicks on Insertion {string} link in Linked List page")
	public void user_clicks_on_insertion_link_in_linked_list_page(String topicLink) {
		commonMethodsPF.openTopicsPage(topicLink);	    
	}

	@Then("User should be navigated to Insertion page with title {string}")
	public void user_should_be_navigated_to_insertion_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTopics();
		Assert.assertTrue(commonMethodsPF.getPageTitle().equals(pageTitle));	    
	}

	@When("User clicks on Try Here button in Insertion page")
	public void user_clicks_on_try_here_button_in_insertion_page() {
		commonMethodsPF.getTryEditorPage();		    
	}

	@When("User clicks on Deletion {string} link in Linked List page")
	public void user_clicks_on_deletion_link_in_linked_list_page(String topicLink) {
		commonMethodsPF.openTopicsPage(topicLink);	    
	}

	@Then("User should be navigated to Deletion page with title {string}")
	public void user_should_be_navigated_to_deletion_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTopics();
		Assert.assertTrue(commonMethodsPF.getPageTitle().equals(pageTitle));	    
	}

	@When("User clicks on Try Here button in Deletion page")
	public void user_clicks_on_try_here_button_in_deletion_page() {
		commonMethodsPF.getTryEditorPage();		    
	}
	
}
