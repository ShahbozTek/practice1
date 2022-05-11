package step.definitions;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;
import utilities.WebDriverUtility;

public class DesktopsStepDef extends Base{
	
	
	DesktopsPage user = new DesktopsPage();
	
	

	@Given("user is on Retail home Page")
	public void user_is_on_retail_home_page() {
	    
	}

	@When("user click on Desktops tab")
	public void user_click_on_desktops_tab() {
	    user.clickOnDesktopsTab();
	    logger.info("User clicked on Desktops Tab");
	    WebDriverUtility.takeScreenShot();
	}

	@When("user click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	    user.clickOnShowAllDesktops();
	    logger.info("User clicked on Show All Desktops");
	    WebDriverUtility.takeScreenShot();
	}

	@Then("user should see all items are present in the Desktop page")
	public void user_should_see_all_items_are_present_in_the_desktop_page() {
	    

	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
	    

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	   

	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
	    

	}

	@When("User click ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	    

	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
	   

	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	    

	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	    

	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	    

	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
	    

	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
	    

	}
	
	
	
}
