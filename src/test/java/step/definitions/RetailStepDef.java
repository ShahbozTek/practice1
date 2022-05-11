package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPage;
import utilities.WebDriverUtility;

public class RetailStepDef extends Base{

	RetailPage user = new RetailPage();
	
	
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		user.clickMyAccount();
		logger.info("User clicked on My Account.");
		WebDriverUtility.takeScreenShot();
	}

	@When("User click on Login")
	public void user_click_on_login() {
		user.clickLogin();
		logger.info("User Clicked on Login");
		WebDriverUtility.takeScreenShot();
	}

	@When("User enter username ‘userName’ and password 'password’")
	public void user_enter_username_user_name_and_password_password() {
		user.inputUsername("");
		logger.info("User input username.");
		WebDriverUtility.takeScreenShot();
		user.inputPassword("");
		logger.info("User input password.");
		WebDriverUtility.takeScreenShot();
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		user.clickLoginButton();
		logger.info("User clicked Login Button");
		WebDriverUtility.takeScreenShot();
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(user.messageIsDisplayed());
		logger.info("User is logged into My Account Dashboard.");
		WebDriverUtility.takeScreenShot();
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {


	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {

;
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {


	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {


	}

	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {


	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {


	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {


	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {


	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {


	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {


	}

	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {


	}

}
