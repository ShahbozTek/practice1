package page.objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage extends Base{

	/**
	 * In this class we will store all UI Elements that belongs to Home page of this
	 * application.
	 */

	/**
	 * We will use PageFactory Class to initialize the UI elements we store in this
	 * class. PageFactory class provides a method called .initElements and this
	 * method job is to initialize all UI (User Interface) Elements.
	 */
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// @FindBy annotation is == driver.findElement()
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;
	
	@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currency;
	
	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euroCurrency;
	
	@FindBy(xpath = "//strong[text()='€']")
	private WebElement euroLogo;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartButton;
	
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement emptyCartMessage;
	
	
	//Encapsulating private WebElements by storing them into a public method
	
	public boolean isCartEmpty() {
		if(emptyCartMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean euroIsDisplayed() {
		if(euroLogo.isDisplayed()) 
			return true;
		else
			return false;
	}
	
	
	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnCurrency() {
		currency.click();
		
	}
	
	public void selectEuroOption() {
		euroCurrency.click();
	}
	
	public void clickOnCart() {
		cartButton.click();
	}
	
	
	
}
