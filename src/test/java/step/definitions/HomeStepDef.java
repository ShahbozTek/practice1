package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import utilities.WebDriverUtility;

public class HomeStepDef extends Base{
	
	HomePage home = new HomePage();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
	    home.isLogoDisplayed();
	    logger.info("User on on Retail Website");
	    WebDriverUtility.takeScreenShot();
	}
	
	@When("User click on Currency")
	public void user_click_on_currency() {
	   home.clickOnCurrency();
	   logger.info("User clicked on currency");
	   WebDriverUtility.takeScreenShot();
	}
	
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
	    home.selectEuroOption();
	    logger.info("User selected Euro from currency dropdown");
	    WebDriverUtility.takeScreenShot();
	}
	
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertTrue(home.euroIsDisplayed());
		logger.info("Currency Set to Euro €");
		WebDriverUtility.takeScreenShot();
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		home.clickOnCart();
		logger.info("User clicked on cart");
		WebDriverUtility.takeScreenShot();
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		Assert.assertTrue(home.isCartEmpty());
		logger.info("Empty Cart Message is Displayed");
		WebDriverUtility.takeScreenShot();
	}

	
	
	

}
