package dsportal.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataStructuresPagePF {
	private WebDriver driver;
	public DataStructuresPagePF (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (className="list-group-item")
	private List<WebElement> topicsLinkList;
	
	@FindBy (linkText="Practice Questions")
	private WebElement practiceQuestions;
	
	@FindBy (linkText="Try here>>>")
	private WebElement tryHereButton;
	
	@FindBy(linkText = "Applications of Array")
	private WebElement ApplicationsofArray;
	
	
	//To open topics pages from Data Structure page in a new tab
	public void openTopicsPage (String topicLink) {
		for (int i=0; i<topicsLinkList.size(); i++) {
			if(topicsLinkList.get(i).getText().equalsIgnoreCase(topicLink)) {
				WebElement topic= topicsLinkList.get(i);
				Actions action = new Actions(driver);
				Keys modifierKey = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
				action.keyDown(modifierKey).click(topic).keyUp(modifierKey).perform();
				break;				
			}
		}
	}
	
	public void clickPracticeQuestionsLink() {
		practiceQuestions.click();
	}
	
	//To navigate to tryEditor page
	public void getTryEditorPage() {
		tryHereButton.click();
	}
	
	public void getApplicationsofArray() {
		ApplicationsofArray.click();
	}
	
}
