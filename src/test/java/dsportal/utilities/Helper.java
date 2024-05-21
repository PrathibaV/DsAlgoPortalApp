package dsportal.utilities;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Scenario;

public class Helper {
	WebDriver driver;
	static String defaultWindow;

	public Helper(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean isScenarioTaggedWith(Scenario scenario, String tag) {
		return scenario.getSourceTagNames().contains(tag);
	}

	// To switch control from data Structure page to the topic page in new window
	public void windowHandlesToSwitchToTopics() {
		 defaultWindow = driver.getWindowHandle();
		Set<String> DSPageHandles = driver.getWindowHandles();	
		for (String newWindow : DSPageHandles) {
			if(newWindow != defaultWindow) {
				driver.switchTo().window(newWindow);
			}
		}
	}

	// To close the topic page window and switch the control back to Data Structure page
	public void closeTopic() {
		driver.close();
	}

	public void switchToDataStructurePage() {
		driver.switchTo().window(defaultWindow);
	}
	
	// To get the error message in the alert popup
	public String getAlertMessageText() {
		return driver.switchTo().alert().getText();
	}

	// To click ok button on alert popup
	public void closeAlert() {
		driver.switchTo().alert().accept();
	}

	public void clearEditorBox() {
		/*
		 * Actions action = new Actions(driver);
		 * action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.
		 * BACK_SPACE).perform();
		 */
		driver.navigate().refresh();
	}
}
