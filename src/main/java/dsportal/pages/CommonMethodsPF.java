package dsportal.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonMethodsPF {
	WebDriver driver;
	public CommonMethodsPF (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (className="list-group-item")
	List<WebElement> topicsLinkList;
	
	@FindBy (linkText="Try here>>>")
	WebElement tryHereButton;
	
	@FindBy (xpath="//div[contains(@class,'CodeMirror')]/div/textarea")
	WebElement editor;
	
	@FindBy (xpath="//button[text()='Run']")
	WebElement runButton;
	
	@FindBy (id="output")
	WebElement codeOutput;

	//To get page title of any page
	public String getPageTitle() {
		  return driver.getTitle(); 
	  }
	
	//To get the url of current page
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	//To open topics pages from Data Structure page in a new tab
	public void openTopicsPage (String topicLink) {
		for (int i=0; i<topicsLinkList.size(); i++) {
			if(topicsLinkList.get(i).getText().equalsIgnoreCase(topicLink)) {
				WebElement topic= topicsLinkList.get(i);
				Actions action = new Actions(driver);
				action.keyDown(Keys.CONTROL).click(topic).keyUp(Keys.CONTROL).perform();
				break;				
			}
		}
	}
	
	//To navigate to tryEditor page
	public void getTryEditorPage() {
		tryHereButton.click();
	}
	
	//To enter python code in the editor box
	public void enterPythonCode(String pythonCode) {
		editor.sendKeys(pythonCode);
	}
	
	//To click run button in the tryEditor page
	public void clickRunButton () {
		runButton.click();
	}
	
	//To get the output of the python code in tryEditor page
	public String getCodeOutput() {
		  return codeOutput.getText(); 
	  }
	
	public void openLinkInNewTab() {
		
	}
}
