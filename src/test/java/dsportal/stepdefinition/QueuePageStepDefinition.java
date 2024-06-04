package dsportal.stepdefinition;

import org.junit.Assert;

import dsportal.pages.DataStructuresPagePF;
import dsportal.pages.HomePagePF;
import dsportal.utilities.Helper;
import dsportal.webdriverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueuePageStepDefinition {
	private HomePagePF homePagePF = new HomePagePF(DriverFactory.getDriver());
	private DataStructuresPagePF dataStructuresPF = new DataStructuresPagePF(DriverFactory.getDriver());
	private Helper helper = new Helper(DriverFactory.getDriver());

	@Given("User is in Queue page")
	public void user_is_in_queue_page() {
		homePagePF.getDsPage("Queue");
	}

	@When("User clicks on Implementation of Queue in Python {string} link in Queue page")
	public void user_clicks_on_implementation_of_queue_in_python_link_in_queue_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to  Implementation of Queue in Python page with title {string}")
	public void user_should_be_navigated_to_implementation_of_queue_in_python_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToQueueTopic();
		helper.waitForPageTitle(pageTitle);
		Assert.assertEquals(helper.getPageTitle(), pageTitle);
	}

	@When("User clicks Try Here button in Implementation of Queue in Python page")
	public void user_clicks_try_here_button_in_implementation_of_queue_in_python_page() {
		dataStructuresPF.getTryEditorPage();
	}

	@Given("User has navigated to Queue page")
	public void user_has_navigated_to_queue_page() {
		helper.closeQueueTopic();
		helper.switchToQueuePage();
	}

	@When("User clicks on Implementation using collections.deque {string} link in Queue page")
	public void user_clicks_on_implementation_using_collections_deque_link_in_queue_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Implementation using collections.deque page with title {string}")
	public void user_should_be_navigated_to_implementation_using_collections_deque_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToQueueTopic();
		helper.waitForPageTitle(pageTitle);
		Assert.assertEquals(helper.getPageTitle(), pageTitle);
	}

	@When("User clicks Try Here button in Implementation using collections.deque page")
	public void user_clicks_try_here_button_in_implementation_using_collections_deque_page() {
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Implementation using array {string} link in Queue page")
	public void user_clicks_on_implementation_using_array_link_in_queue_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Implementation using array page with title {string}")
	public void user_should_be_navigated_to_implementation_using_array_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToQueueTopic();
		helper.waitForPageTitle(pageTitle);
		Assert.assertEquals(helper.getPageTitle(), pageTitle);
	}

	@When("User clicks Try Here button in Implementation using array page")
	public void user_clicks_try_here_button_in_implementation_using_array_page() {
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Queue Operations {string} link in Queue page")
	public void user_clicks_on_queue_operations_link_in_queue_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Queue Operations page with title {string}")
	public void user_should_be_navigated_to_queue_operations_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToQueueTopic();
		helper.waitForPageTitle(pageTitle);
		Assert.assertEquals(helper.getPageTitle(), pageTitle);
	}

	@When("User clicks Try Here button in Queue Operations page")
	public void user_clicks_try_here_button_in_queue_operations_page() {
		dataStructuresPF.getTryEditorPage();
	}
}
