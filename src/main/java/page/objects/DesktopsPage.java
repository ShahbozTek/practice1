package page.objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPage extends Base {

	/**
	 * In this class we will store all UI Elements that belongs to Home page of this
	 * application.
	 */

	/**
	 * We will use PageFactory Class to initialize the UI elements we store in this
	 * class. PageFactory class provides a method called .initElements and this
	 * method job is to initialize all UI (User Interface) Elements.
	 */
	public DesktopsPage() {
		PageFactory.initElements(driver, this);
	}

	// @FindBy annotation is == driver.findElement()
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(xpath = "")
	private WebElement tbd2;
	
	@FindBy(xpath = "")
	private WebElement tbd3;
	
	@FindBy(xpath = "")
	private WebElement tbd4;
	
	
	
	public void clickOnDesktopsTab() {
		desktopsTab.click();
	}
	
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	
	

}
