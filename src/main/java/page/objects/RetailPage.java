package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPage extends Base{

	/**
	 * In this class we will store all UI Elements that belongs to Home page of this
	 * application.
	 */

	/**
	 * We will use PageFactory Class to initialize the UI elements we store in this
	 * class. PageFactory class provides a method called .initElements and this
	 * method job is to initialize all UI (User Interface) Elements.
	 */
	public RetailPage() {
		PageFactory.initElements(driver, this);
	}

	// @FindBy annotation is == driver.findElement()
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath = "//input[@placeholder='E-Mail Address']")
	private WebElement usernameField;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;
	
	
	
	public boolean messageIsDisplayed() {
		String expected = "";
		WebElement actual = driver.findElement(By.xpath(""));
			if(expected.equals(actual.getText())) 
				return true;
			else 
				return false;
	}
	
	
	public void clickMyAccount() {
		myAccount.click();
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public void inputUsername(String userName) {
		usernameField.sendKeys(userName);
	}
	
	public void inputPassword(String passWord) {
		passwordField.sendKeys(passWord);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	
	
	
	
	
	
	
}
