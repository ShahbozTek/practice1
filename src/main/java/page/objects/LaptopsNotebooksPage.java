package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNotebooksPage extends Base{

	
	/**
	 * In this class we will store all UI Elements that belongs to Home page of this
	 * application.
	 */

	/**
	 * We will use PageFactory Class to initialize the UI elements we store in this
	 * class. PageFactory class provides a method called .initElements and this
	 * method job is to initialize all UI (User Interface) Elements.
	 */
	public LaptopsNotebooksPage() {
		PageFactory.initElements(driver, this);
	}

	// @FindBy annotation is == driver.findElement()
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopNotebookTab;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopNotebook;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macbook;
	
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macbookPro;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMacbook;
	
	@FindBy(xpath = "//span[text()='1 item(s) - $602.00']")
	private WebElement oneItemInCart;
	
	@FindBy(xpath = "//div[@id='cart']")
	private WebElement cartButton;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement redX;
	
	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement zeroItemsInCart;
	
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[2]")
	private WebElement macbookCompare;
	
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[3]")
	private WebElement macbookAirCompare;
	
	@FindBy(xpath = "//a[text()='create an account']")
	private WebElement addWishListMessage;
	
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement macbookProPrice;
	
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement compareMessage;
	
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement compareLink;
	
	@FindBy(xpath = "//td[text()='Product']")
	private WebElement compareChartVerification;
	
	@FindBy(xpath = "(//button[@data-original-title='Add to Wish List'])[5]")
	private WebElement addSonyVaioToWishlist;
	
	public void clickOnSonyWishlist() {
		addSonyVaioToWishlist.click();
	}
	
	public boolean compareChartPresent() {
		if(compareChartVerification.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickCompareLink() {
		compareLink.click();
	}
	
	public boolean comparisonMessage() {
		if(compareMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean macbookProPriceDisplayed() {
		if (macbookProPrice.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickCompareMacbookAir() {
		macbookAirCompare.click();
	}
	
	public void clickOnMacbookPro() {
		macbookPro.click();
	}
	
	public boolean wishListLoginMessage() {
		if (addWishListMessage.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickCompareMacbook() {
		macbookCompare.click();
	}
	
	public boolean isZeroItemsInCart() {
		if (zeroItemsInCart.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickRedX() {
		redX.click();
	}
	
	public void clickOnCart() {
		cartButton.click();
	}
	
	public boolean isOneItemInCart() {
		if (oneItemInCart.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	public boolean isMacbookAdded() {
		if(successMacbook.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnLaptopNotebookTab() {
		laptopNotebookTab.click();
	}
	
	public void clickShowAllLaptopNotebook() {
		showAllLaptopNotebook.click();
	}
	
	public void clickMacbook() {
		macbook.click();
	}
	
	
	
	
	
	
	
}
