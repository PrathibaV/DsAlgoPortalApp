package dsportal.utilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class Helper {
	private WebDriver driver;	
	private static String stackWindow;
	private static String LinkedListWindow;
	private static String IntroductionWindow;
	private static String arrayWindow;
	private static String queueWindow;
	private static String graphWindow;
	private static String treeWindow;

	public Helper(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean isScenarioTaggedWith(Scenario scenario, String tag) {
		return scenario.getSourceTagNames().contains(tag);
	}	

	//To get page title of any page
		public String getPageTitle() {
			  return driver.getTitle(); 
		  }
		
		//To get the url of current page
		public String getPageUrl() {
			return driver.getCurrentUrl();
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
		driver.navigate().refresh();
	}
	
	public void goToPreviousPage() {
		driver.navigate().back();
	}
	
	
	// To switch control from Stack page to the topic page in new window
	public void windowHandlesToSwitchToStackTopics() {
		 stackWindow = driver.getWindowHandle();
		// this.defaultWindow=defaultWindow;
		Set<String> StackPageHandles = driver.getWindowHandles();	
		for (String newWindow : StackPageHandles) {
			if(newWindow != stackWindow) {
				driver.switchTo().window(newWindow);
			}
		}
	}	
	
	public void closeStackTopic() {
		driver.close();
	}
	
	public void switchToStackPage() {
		driver.switchTo().window(stackWindow);
	}
	
	public void windowHandlesToSwitchToLinkedListTopics() {
		 LinkedListWindow = driver.getWindowHandle();
		// this.defaultWindow=defaultWindow;
		Set<String> LinkedListPageHandles = driver.getWindowHandles();	
		for (String newWindow : LinkedListPageHandles) {
			if(newWindow != LinkedListWindow) {
				driver.switchTo().window(newWindow);
			}
		}
	}	
	
	public void closeLinkedListTopic() {
		driver.close();
	}
	
	public void switchToLinkedPage() {
		driver.switchTo().window(LinkedListWindow);
	}
	
	public void windowHandlesToSwitchToIntroductionTopics() {
		 IntroductionWindow = driver.getWindowHandle();
		// this.defaultWindow=defaultWindow;
		Set<String> IntroductionPageHandles = driver.getWindowHandles();	
		for (String newWindow : IntroductionPageHandles) {
			if(newWindow != IntroductionWindow) {
				driver.switchTo().window(newWindow);
			}
		}
	}	
	
	public void closeIntroductionTopic() {
		driver.close();
	}
	
	public void switchToIntroductionPage() {
		driver.switchTo().window(IntroductionWindow);
	}
	
	
	
	public void scrollDownByLength(WebDriver driver, int length) {       
        JavascriptExecutor js = (JavascriptExecutor) driver;        
        js.executeScript("window.scrollBy(0, arguments[0]);", length);
    }
	
	public void waitForPageTitle(String title) {
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public void windowHandlesToSwitchToArrayTopic() {
		arrayWindow = driver.getWindowHandle();
		Set<String> arrayPageHandles = driver.getWindowHandles();
		for (String newWindow : arrayPageHandles) {
			if (newWindow != arrayWindow) {
				driver.switchTo().window(newWindow);
			}
		}
	}
	
	public void closeArrayTopic() {
		driver.close();
	}

	public void switchToArrayPage() {
		driver.switchTo().window(arrayWindow);
	}
	
	public void windowHandlesToSwitchToQueueTopic() {
		queueWindow = driver.getWindowHandle();
		Set<String> arrayPageHandles = driver.getWindowHandles();
		for (String newWindow : arrayPageHandles) {
			if (newWindow != queueWindow) {
				driver.switchTo().window(newWindow);
			}
		}
	}
	
	public void closeQueueTopic() {
		driver.close();
	}

	public void switchToQueuePage() {
		driver.switchTo().window(queueWindow);
	}
	
	public void windowHandlesToSwitchToGraphTopics() {
		graphWindow = driver.getWindowHandle();
		Set<String> arrayPageHandles = driver.getWindowHandles();
		for (String newWindow : arrayPageHandles) {
			if (newWindow != graphWindow) {
				driver.switchTo().window(newWindow);
			}
		}
	}
	
	public void closeGraphTopic() {
		driver.close();
	}

	public void switchToGraphPage() {
		driver.switchTo().window(graphWindow);
	}
	
	public void windowHandlesToSwitchToTreeTopics() {
		 treeWindow = driver.getWindowHandle();
		// this.defaultWindow=defaultWindow;
		Set<String> LinkedListPageHandles = driver.getWindowHandles();	
		for (String newWindow : LinkedListPageHandles) {
			if(newWindow != treeWindow) {
				driver.switchTo().window(newWindow);
			}
		}
	}	
	
	public void closeTreeTopic() {
		driver.close();
	}
	
	public void switchToTreePage() {
		driver.switchTo().window(treeWindow);
	}
	
}
