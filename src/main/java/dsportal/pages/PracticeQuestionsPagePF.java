package dsportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeQuestionsPagePF {
	public WebDriver driver;
	
	public PracticeQuestionsPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Practice Questions")
	private WebElement PracticeQuestions;
	@FindBy(linkText = "Search the array")
	private WebElement SearchtheArray;
	@FindBy(linkText = "Max Consecutive Ones")
	private WebElement MaxConsecutiveOnes;
	@FindBy(linkText = "Find Numbers with Even Number of Digits")
	private WebElement FindNumberswithEvenNumberofDigits;
	@FindBy(xpath = "//a[contains(text(),'Squares of')]")
	private WebElement SquaresofaSortedArray;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	private WebElement editorBox;
	@FindBy(xpath = "//button[normalize-space()='Run']")
	private WebElement editorRunButton;
	@FindBy(xpath = "//pre[@id='output']")
	private WebElement output;
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submit;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	private WebElement pythonEditor;
	@FindBy(xpath = "//div[@class='input']//div/textarea")
	private WebElement edit;
	

	public String getPracticeQuestions() {
		PracticeQuestions.click();
		return driver.getTitle();
	}

	public void getSearchtheArray() {
		SearchtheArray.click();

	}

	public void getMaxConsecutiveOnes() {
		MaxConsecutiveOnes.click();
	}

	public void getFindNumberswithEvenNumberofDigits() {
		FindNumberswithEvenNumberofDigits.click();
	}

	public void getSquaresofaSortedArray() {
		SquaresofaSortedArray.click();
	}

	public void goBack() {
		driver.navigate().back();
	}

	public void getEditorBox() {
		editorBox.click();
	}

	public void clickEditorRunButton() {
		editorRunButton.click();
	}

	public String getOutput() {
		return output.getText();
	}

	/*
	 * public void clearEditorText() { driver.navigate().refresh();
	 * driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")
	 * ) .sendKeys(Keys.chord(Keys.CONTROL, "a"));
	 * driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")
	 * ).sendKeys(Keys.DELETE); }
	 */
	
	public WebElement getTextArea() {
		return edit;
	}

	public String getErrorMessageText() {
		return driver.switchTo().alert().getText();
	}

	public void closeAlert() {
		driver.switchTo().alert().accept();

	}
	
	public void getPythonEditor(String code) {

		pythonEditor.sendKeys(code);

	}
}
