package dsportal.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagePF {
	WebDriver driver;

	public HomePagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/register']")
	WebElement register;

	@FindBy(linkText = "Sign in")
	WebElement signIn;

	@FindBy(xpath = "//div[contains(@class,'card-body')]")
	List<WebElement> modulesList;

	/*
	 * @FindBy (xpath="//*[@class='col']/div/div/a") List<WebElement> modulesList;
	 */

	@FindBy(className = "card-title")
	List<WebElement> moduleTitle;

	@FindBy(xpath = "//a[text()='Get Started']")
	List<WebElement> getStartedButton;

	@FindBy(xpath = "//div[contains(text(),'not logged')]")
	WebElement notLoggedMsg;

	@FindBy(css = ".nav-link.dropdown-toggle")
	WebElement DataStructureDD;

	@FindBy(xpath = "//a[@class='dropdown-item']")
	List<WebElement> DataStructureList;

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//*[@value='Login']")
	WebElement loginButton;

	@FindBy(xpath = "//ul/a[2]")
	WebElement usernameLink;

	@FindBy(linkText = "Sign out")
	WebElement signOutLink;

	@FindBy(linkText = "NumpyNinja")
	WebElement numpyNinjaLink;

	// GetStarted button on landing page
	@FindBy(className = "btn")
	WebElement lpGetStartedBtn;

	/*
	 * @FindBy (xpath="//h5[contains(text(),'"+dataStructure+"')]/../a") WebElement
	 * DsGetStartedButton;
	 */

	// To go to home page from landing page
	public void getHomePageFromLp() {
		lpGetStartedBtn.click();
	}

	public String getRegisterlink() {
		return register.getText();
	}

	public String getSignInlink() {
		return signIn.getText();
	}

	// To click Get Started button from all the DS modules in loop
	public void clickGetStartedButton(int index) {
		getStartedButton.get(index).click();
	}

	// To get the list of all Get Started button under the DS modules
	public List<WebElement> getButtons() {
		return getStartedButton;
	}

	// To get the not logged in message
	public String getMessage() {
		return notLoggedMsg.getText();
	}

	// To click the DS dropdown from navigation bar
	public void clickDataStructureDD() {
		DataStructureDD.click();
	}

	// To get the list DS links from the dropdown
	public List<WebElement> getDataStructureList() {
		return DataStructureList;
	}

	// To click a DS link from the dropdown in loop
	public void clickDsFromDropdown(int index1) {
		DataStructureList.get(index1).click();
	}

	public void clickSignIn() {
		signIn.click();
	}

	public void getLogin(String userName, String passWord) {
		username.sendKeys(userName);
		password.sendKeys(passWord);
		loginButton.click();
	}

	// To read the username link text on navigation bar
	public String getUsernameLinkText() {
		return usernameLink.getText();
	}

	// To read the sign out link text on navigation bar
	public String getSignOutLinkText() {
		return signOutLink.getText();
	}

	// To click the Get Started button under each module in loop
	public void getDsPage(String dataStructure) {

		/*
		 * WebElement module= modulesList.stream().filter(ml ->
		 * ml.findElement(By.className("card-title")).getText().equalsIgnoreCase(
		 * dataStructure)).findFirst().orElse(null);
		 * module.findElement(By.linkText("Get Started")).click();
		 */
		
		for (int i = 0; i < modulesList.size(); i++) {
			String DsModuleTitle = modulesList.get(i).findElement(By.className("card-title")).getText();
			if (DsModuleTitle.equalsIgnoreCase(dataStructure)) {
				modulesList.get(i).findElement(By.linkText("Get Started")).click();
				break;
			}
		}
	}

	// To go to Home page from child pages
	public void getHomePage() {
		numpyNinjaLink.click();
		lpGetStartedBtn.click();
	}

	public void clickNumpyNinjaLink() {
		numpyNinjaLink.click();
	}

}
