package dsportal.stepdefinition;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.junit.Assert;


import dsportal.pages.DataStructuresPagePF;
import dsportal.pages.HomePagePF;
import dsportal.utilities.Helper;
import dsportal.webdriverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphpageStepdefinition {
	private HomePagePF homePagePF = new HomePagePF(DriverFactory.getDriver());
	private DataStructuresPagePF dataStructuresPF = new DataStructuresPagePF(DriverFactory.getDriver());
	private Helper helper = new Helper(DriverFactory.getDriver());

	@Given("User is in Graph page")
	public void user_is_in_graph_page() {
		homePagePF.getDsPage("Graph");
	    
	}

	@When("User clicks on Graph {string} link in Graph page")
	public void user_clicks_on_graph_link_in_graph_page(String topicLink) {
		dataStructuresPF.openTopicsPage(topicLink);
	    
	}

	@Then("User should be navigated to Graph page with title {string}")
	public void user_should_be_navigated_to_graph_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToGraphTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));		    
	}

	@When("User clicks Try Here button in Graph page")
	public void user_clicks_try_here_button_in_graph_page() {
		helper.scrollDownByLength(DriverFactory.getDriver(),500);
		dataStructuresPF.getTryEditorPage();	    
	}

	@Given("User has navigated to Graph page")
	public void user_has_navigated_to_graph_page() {
		helper.closeGraphTopic();
		helper.switchToGraphPage();	    
	}

	@When("User clicks on Graph Representations {string} link in Graph page")
	public void user_clicks_on_graph_representations_link_in_graph_page(String topicLink) {
		dataStructuresPF.openTopicsPage(topicLink);	    
	}

	@Then("User should be navigated to Graph Representations page with title {string}")
	public void user_should_be_navigated_to_graph_representations_page_with_title(String pageTitle) {
		helper.windowHandlesToSwitchToGraphTopics();
		helper.waitForPageTitle(pageTitle);
		Assert.assertTrue(helper.getPageTitle().equals(pageTitle));	 	    
	}

	@When("User clicks on any of the topics {string} on Graph page")
	public void user_clicks_on_any_of_the_topics_on_graph_page(String topic) {
		dataStructuresPF.openTopicsPage(topic);
		helper.windowHandlesToSwitchToGraphTopics();	    
	}		
	
}
