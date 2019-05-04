package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ap_email")
	private WebElement emailFeild;

	public WebElement getemailFeild() {
		return emailFeild;
	}

	
	@FindBy(xpath="//div[@class='a-row a-spacing-base']/span")
	private WebElement enteredNumber;
	
	public WebElement getEmailFeild() {
		return emailFeild;
	}

	public WebElement getEnteredNumber() {
		return enteredNumber;
	}

	@FindBy(id = "ap_password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id = "signInSubmit")
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	@FindBy(id = "continue")
	private WebElement continueBtn;

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	
}
