package dsportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonMethodsPF {
	WebDriver driver;
	public CommonMethodsPF (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		  return driver.getTitle(); //
	  }
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
}
