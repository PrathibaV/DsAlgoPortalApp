
package dsportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPagePF {
	
WebDriver driver;
	
	public SignInPagePF (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	
		@FindBy(name="username")WebElement usernameBox;
		@FindBy(name="password") WebElement passwordBox;
		@FindBy(xpath="//input[@value='Login']") WebElement loginButton;
		@FindBy(linkText="Register!") WebElement register;
		@FindBy(xpath="//div[@class=\"navbar-nav\"][2]/ul/a[2]") WebElement username_displayed;
		@FindBy(xpath="//div[contains(text(),'You are logged in')]") WebElement successMessage;
		@FindBy(xpath="//div[contains(text(),'Invalid Username and Password')]") WebElement invalidMessage;
		
		public void enterUsername(String username) {
			usernameBox.sendKeys(username);
			
		}
		public void enterPassword(String password) {
			passwordBox.sendKeys(password);
			
		}
		public void clickloginButton() {
			loginButton.click();		
		}
		
		public void clickRegisterFromLoginPage() {
			register.click();		
		}
		public String getUsername() {
			String validUsername=username_displayed.getText();
			return validUsername;
		}
		
		public String getSuccessMessage() {
			String success_message=successMessage.getText();
			return success_message;
		}
		
		public String getInvalidMessage() {
			String invalid_message=invalidMessage.getText();
			return invalid_message;
		}
		
		public String getUsernameAttributeMessage() {
			String message=usernameBox.getAttribute("validationMessage");
			return message;			
		}
		
		public String getpasswordAttributeMessage() {
			String message=passwordBox.getAttribute("validationMessage");
			return message;			
		}
	}
