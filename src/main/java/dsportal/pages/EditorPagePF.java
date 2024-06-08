package dsportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditorPagePF {
	private WebDriver driver;
	public EditorPagePF (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[contains(@class,'CodeMirror')]/div/textarea")
	private WebElement editor;
	
	@FindBy (xpath="//button[text()='Run']")
	private WebElement runButton;
	
	@FindBy (id="output")
	private WebElement codeOutput;
	
	//To enter python code in the editor box
		public synchronized void enterPythonCode(String pythonCode) {
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
}
