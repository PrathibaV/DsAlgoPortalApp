package dsportal.stepdefinition;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.Assert;
import dsportal.pages.DataStructuresPagePF;
import dsportal.pages.EditorPagePF;
import dsportal.pages.HomePagePF;
import dsportal.utilities.ExcelReader;
import dsportal.utilities.Helper;
import dsportal.webdriverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreePageStepDefinition {
	private HomePagePF homePagePF = new HomePagePF(DriverFactory.getDriver());
	private DataStructuresPagePF dataStructuresPF = new DataStructuresPagePF(DriverFactory.getDriver());
	private Helper helper = new Helper(DriverFactory.getDriver());
	

	@Given("User is in Tree page")
	public void user_is_in_tree_page() {
		homePagePF.getDsPage("Tree");
	}

	@When("User clicks on Overview of Trees {string} link in Tree page")
	public void user_clicks_on_overview_of_trees_link_in_tree_page(String topicLink) throws InterruptedException {

		//helper.scrollTreePage();
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Overview of Trees page with title {string}")
	public void user_should_be_navigated_to_overview_of_trees_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks Try Here button in Overview of Trees page")
	public void user_clicks_try_here_button_in_overview_of_trees_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(), 300);
		dataStructuresPF.getTryEditorPage();
	}

	@Given("User has navigated to Tree page")
	public void user_has_navigated_to_tree_page() {
		helper.closeTreeTopic();
		helper.switchToTreePage();
	}

	@When("User clicks on Terminologies {string} link in Tree page")
	public void user_clicks_on_terminologies_link_in_tree_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(), 300);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Terminologies page with title {string}")
	public void user_should_be_navigated_to_terminologies_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks on Try Here button in Terminologies page")
	public void user_clicks_on_try_here_button_in_terminologies_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(),300);
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Types of Trees {string} link in Tree page")
	public void user_clicks_on_types_of_trees_link_in_tree_page(String topicLink) {
		//helper.scrollDownByLength(DriverFactory.getDriver(), 500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Types of Trees page with title {string}")
	public void user_should_be_navigated_to_types_of_trees_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks on Try Here button in Types of Trees page")
	public void user_clicks_on_try_here_button_in_types_of_trees_page() {
		//helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Tree Traversals {string} link in Tree page")
	public void user_clicks_on_tree_traversals_link_in_tree_page(String topiclink) {
		//helper.scrollDownByLength(DriverFactory.getDriver(), 500);
		dataStructuresPF.openTopicsPage(topiclink);
	}

	@Then("User should be navigated to Tree Traversals page with title {string}")
	public void user_should_be_navigated_to_tree_traversals_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);

		// System.out.println("title of the page " +helper.getPageTitle());
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks Try Here button in Tree Traversals page")
	public void user_clicks_try_here_button_in_tree_traversals_page() {		
		//helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Traversals-Illustration {string} link in Tree page")
	public void user_clicks_on_traversals_illustration_link_in_tree_page(String topicLink) {
		//helper.scrollDownByLength(DriverFactory.getDriver(), 500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Traversals-Illustration page with title {string}")
	public void user_should_be_navigated_to_traversals_illustration_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);
		// System.out.println("page title is " +helper.getPageTitle());
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks Try Here button in Traversals-illustration page")
	public void user_clicks_try_here_button_in_traversals_Illustration_page() {
		//helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Binary Trees {string} link in Tree page")
	public void user_clicks_on_binary_trees_link_in_tree_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(), 500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Binary Trees page with title {string}")
	public void user_should_be_navigated_to_binary_trees_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks Try Here button in Binary Trees page")
	public void user_clicks_try_here_button_in_binary_trees_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Types of Binary Trees {string} link in Tree page")
	public void user_clicks_on_types_of_binary_trees_link_in_tree_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(), 500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Types of Binary Trees page with title {string}")
	public void user_should_be_navigated_to_types_of_binary_trees_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks Try Here button in Types of Binary Trees page")
	public void user_clicks_try_here_button_in_types_of_binary_trees_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(), 500);
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Implementation in Python {string} link in Tree page")
	public void user_clicks_on_implementation_in_python_link_in_tree_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(), 500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Implementation in Python page with title {string}")
	public void user_should_be_navigated_to_implementation_in_python_page_with_title(String pageTitle)
			throws InterruptedException {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks Try Here button in Implementation in Python page")
	public void user_clicks_try_here_button_in_implementation_in_python_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Binary Tree Traversals {string} link in Tree page")
	public void user_clicks_on_binary_tree_traversals_link_in_tree_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(), 500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Binary Tree Traversals page with title {string}")
	public void user_should_be_navigated_to_binary_tree_traversals_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks Try Here button in Binary Tree Traversals page")
	public void user_clicks_try_here_button_in_binary_tree_traversals_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Implementation of Binary Trees {string} link in Tree page")
	public void user_clicks_on_implementation_of_binary_trees_link_in_tree_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(), 500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Implementation of Binary Trees page with title {string}")
	public void user_should_be_navigated_to_implementation_of_binary_trees_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks Try Here button in Implementation of Binary Trees page")
	public void user_clicks_try_here_button_in_implementation_of_binary_trees_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Applications of Binary trees {string} link in Tree page")
	public void user_clicks_on_applications_of_binary_trees_link_in_tree_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(), 500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Applications of Binary trees page with title {string}")
	public void user_should_be_navigated_to_applications_of_binary_trees_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks Try Here button in Applications of Binary trees page")
	public void user_clicks_try_here_button_in_applications_of_binary_trees_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Binary Search Trees {string} link in Tree page")
	public void user_clicks_on_binary_search_trees_link_in_tree_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(), 500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Binary Search Trees page with title {string}")
	public void user_should_be_navigated_to_binary_search_trees_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks Try Here button in Binary Search Trees page")
	public void user_clicks_try_here_button_in_binary_search_trees_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on Implementation Of BST {string} link in Tree page")
	public void user_clicks_on_implementation_of_bst_link_in_tree_page(String topicLink) {
		helper.scrollDownByLength(DriverFactory.getDriver(), 500);
		dataStructuresPF.openTopicsPage(topicLink);
	}

	@Then("User should be navigated to Implementation Of BST page with title {string}")
	public void user_should_be_navigated_to_implementation_of_bst_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToTreeTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));
	}

	@When("User clicks Try Here button in Implementation Of BST page")
	public void user_clicks_try_here_button_in_implementation_of_bst_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.getTryEditorPage();
	}

	@When("User clicks on any of the topics {string} on Tree page")
	public void user_clicks_on_any_of_the_topics_on_tree_page(String topic) {
		dataStructuresPF.openTopicsPage(topic);
		helper.windowHandlesToSwitchToTreeTopics();
	}
}
