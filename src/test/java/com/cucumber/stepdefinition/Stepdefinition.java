package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.pom.HomePage;
import com.cucumber.pom.LoginPage;
import com.cucumber.testrunner.TestRunner;
import com.cucumber.utils.BaseClass;
import com.cucumber.utils.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;

	public static PageObjectManager p = new PageObjectManager(driver);

	@Given("^User should be in Amazon Home Page$")
	public void user_should_be_in_Amazon_Home_Page() throws Throwable {
		// System.out.println("user_should_be_in_Amazon_Home_Page");

		getUrl("https://www.amazon.in/");
	}

	@When("^User mouse hover to SignIn button in the Header$")
	public void user_mouse_hover_to_SignIn_button_in_the_Header() throws Throwable {
		mouseHover(p.getHomePage().getMouseHover());
		// System.out.println("user_mouse_hover_to_SignIn_button_in_the_Header");

	}

	@When("^User Click on Signin button in AJAX call$")
	public void user_Click_on_Signin_button_in_AJAX_call() throws Throwable {
		elementClick(p.getHomePage().getClickSignin());
		// System.out.println("user_Click_on_Signin_button_in_AJAX_call");

	}

	@When("^User enter the email/mobile number in the emailid feild$")
	public void user_enter_the_email_mobile_number_in_the_emailid_feild() throws Throwable {
		// System.out.println("user_enter_the_email_mobile_number_in_the_emailid_feild");
		sendKeys(p.getLoginPage().getemailFeild(), "9884774411");
	}

	@When("^User wait for '(.*)' seconds$")
	public static void user_wait_for_few_seconds(int seconds) throws InterruptedException {
		// TODO Auto-generated method stub
		int i = seconds*1000;
		Thread.sleep(i);
	}

	@When("^User verify the entered mobile '(.*)' in the login header title$")
	public void user_the_verify_mobile_number_entered(String number) {
		WebElement enteredNumber = p.getLoginPage().getEnteredNumber();
		String actual = enteredNumber.getText();
		org.junit.Assert.assertEquals("Mobile number comparsion", "+91"+number, actual);
	}
	
	@When("^User click on Continue button$")
	public static void user_click_on_continueButton() throws Exception {
		elementClick(p.getLoginPage().getContinueBtn());
	}

	@When("^User enter the password in the password feild$")
	public void user_enter_the_password_in_the_password_feild() throws Throwable {

		// System.out.println("user_enter_the_password_in_the_password_feild");
		sendKeys(p.getLoginPage().getPassword(), "Lumia*1989*");
	}

	@When("^User click the signin button to login the application$")
	public void user_click_the_signin_button_to_login_the_application() throws Throwable {
		// System.out.println("user_click_the_signin_button_to_login_the_application");
		elementClick(p.getLoginPage().getLoginBtn());
	}

	@Then("^User validate the username in the Header$")
	public void user_validate_the_username_in_the_Header() throws Throwable {
		// System.out.println("user_validate_the_username_in_the_Header");
		String actual = p.getHomePage().getUserName_Header().getText();
		highLightWebElement(p.getHomePage().getUserName_Header());
		org.junit.Assert.assertEquals("Hello, HariPriya", actual);
	}

	@When("^User enter the email/mobile '(.*)' in the emailid feild$")
	public void user_enter_the_email_mobile_in_the_emailid_feild(String userName) throws Throwable {
		sendKeys(p.getLoginPage().getemailFeild(), userName);
	}

	@When("^User enter the password '(.*)' in the password field$")
	public void user_enter_the_password_Lumia_in_the_password_field(String password) throws Throwable {
		sendKeys(p.getLoginPage().getPassword(), password);
	}

	@Then("^User validate the username '(.*)' in the Header$")
	public void user_validate_the_username_Hello_HariPriya_in_the_Header(String userName) throws Throwable {
		String actual = p.getHomePage().getUserName_Header().getText();
		org.junit.Assert.assertEquals(userName, actual);
		highLightWebElement(p.getHomePage().getUserName_Header());
	}
	
	
	@Then("^User mouse hover to username in the header$")
	public void user_mouse_hover_to_username_in_the_header() throws Throwable {
		mouseHover(p.getHomePage().getUserName_Header());
	}

	@Then("^User click on signout button$")
	public void user_click_on_signout_button() throws Throwable {
		elementClick(p.getHomePage().getSignOut());
	}



}
