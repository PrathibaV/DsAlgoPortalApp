package dsportal.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPagePF {

	WebDriver driver;
	
	public StackPagePF (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy (linkText="Operations in Stack")
	WebElement OperationsInStackLink;
	
	@FindBy (linkText="Implementation")
	WebElement ImplementationLink;	
	
	@FindBy (linkText="Applications")
	WebElement ApplicationsLink;
	
	
	
	public void getOperationsInStackPage () {
		OperationsInStackLink.click();				
	}
	
	public String getImplementationPage () {
		ImplementationLink.click();
		return driver.getTitle();		
	}
	
	public String getApplicationsPage () {
		ApplicationsLink.click();
		return driver.getTitle();		
	}
	
		
	
	
	
}
