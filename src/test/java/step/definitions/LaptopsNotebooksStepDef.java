package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopsNotebooksPage;
import utilities.WebDriverUtility;

public class LaptopsNotebooksStepDef extends Base{
	
	LaptopsNotebooksPage user = new LaptopsNotebooksPage();
	
	

	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	    user.clickOnLaptopNotebookTab();
	    logger.info("User clicked on Laptops & Notebooks Tab");
	    WebDriverUtility.takeScreenShot();
	}

	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	    user.clickShowAllLaptopNotebook();
	    logger.info("User clicked on Show All Laptops and Notebooks");
	    WebDriverUtility.takeScreenShot();
	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		user.clickMacbook();
		logger.info("User clicked on Macbook");
		WebDriverUtility.takeScreenShot();
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		Assert.assertTrue(user.isMacbookAdded());
		logger.info("Success Macbook Added to Cart Message is Displayed");
		WebDriverUtility.takeScreenShot();
	}

	@Then("User should see ‘{int} item\\(s){double}’ showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(Integer int1, Double double1) {
		Assert.assertTrue(user.isOneItemInCart());
		logger.info("User Sees '1 item(s) - $602.00' in Cart Field");
		WebDriverUtility.takeScreenShot();
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		user.clickOnCart();
		logger.info("User click on Cart Button");
		WebDriverUtility.takeScreenShot();
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		user.clickRedX();
		logger.info("User Clicked Red X Button");
		WebDriverUtility.takeScreenShot();
	}

	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		Assert.assertTrue(user.isZeroItemsInCart());
		logger.info("User Sees 0 item(s) in Cart");
		WebDriverUtility.takeScreenShot();
	}

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		user.clickCompareMacbook();
		logger.info("User Clicked Compare Product on MacBook");
		WebDriverUtility.takeScreenShot();
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	 user.clickCompareMacbookAir();
	 logger.info("User Clicked Compare Product on MacBook Air");
	 WebDriverUtility.takeScreenShot();
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		Assert.assertTrue(user.comparisonMessage());
		logger.info("User Sees Message ‘Success: You have added MacBook Air to your product comparison!'");
		WebDriverUtility.takeScreenShot();
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		user.clickCompareLink();
		logger.info("User Clicked on Product Comparison Link");
		WebDriverUtility.takeScreenShot();
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(user.compareChartPresent());
		logger.info("User Sees Product Comparison Chart");
		WebDriverUtility.takeScreenShot();
	}

	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		user.clickOnSonyWishlist();
		logger.info("User Clicked on heart icon to add ‘Sony VaIO’ laptop to wish list");
		WebDriverUtility.takeScreenShot();
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		Assert.assertTrue(user.wishListLoginMessage());
		logger.info("User Sees Must Login to Add to Wishlist Message");
		WebDriverUtility.takeScreenShot();
	}

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		user.clickOnMacbookPro();
		logger.info("User Clicked on MacBook Pro");
		WebDriverUtility.takeScreenShot();
	}

	@Then("User should see ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		Assert.assertTrue(user.macbookProPriceDisplayed());
		logger.info("User Sees MacBook Pro Price is $2000.00");
		WebDriverUtility.takeScreenShot();
	}
	
}
