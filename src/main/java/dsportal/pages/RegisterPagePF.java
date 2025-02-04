
package dsportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPagePF {
	
	WebDriver driver;
	
public RegisterPagePF (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	

@FindBy(name="username")
private WebElement usernameBox;
@FindBy(name="password1") 
private WebElement passwordBox;
@FindBy(name="password2") 
private WebElement confirmPassword;
@FindBy(xpath="//input[@value='Register']") 
private WebElement registerButton;
@FindBy(linkText="Sign in") 
private WebElement loginLink;
@FindBy(xpath="//div[contains(text(),'New Account Created')]") 
private WebElement successRegisterMessage;
@FindBy(xpath="//div[contains(text(),'password_mismatch:')]") 
private WebElement invalidMessage;


public void enterUsername(String username) {
	usernameBox.sendKeys(username);
	
}
public void enterPassword(String password) {
	passwordBox.sendKeys(password);
	
}
public void enterConfirmPassword(String password2) {
	confirmPassword.sendKeys(password2);
	
}
public void clickRegisterButton() {
	registerButton.click();		
}

public void clickLoginLink() {
	loginLink.click();		
}


public String getSuccessRegisterMessage() {
	String message=successRegisterMessage.getText();
	return message;	
}

public String getUsernameAttributeMessage() {
	String message=usernameBox.getAttribute("validationMessage");
	System.out.println(message);
	return message;
	
}
public String getPasswordAttributeMessage() {
	String message=passwordBox.getAttribute("validationMessage");
	System.out.println(message);
	return message;
	
}
public String getConfirmPasswordAttributeMessage() {
	String message=confirmPassword.getAttribute("validationMessage");
	System.out.println(message);
	return message;
	
}
public String getInvalidMessage() {
	String message=invalidMessage.getText();
	return message;
	
}


}
