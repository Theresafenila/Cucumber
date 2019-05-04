package com.cucumber.utils;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.HomePage;
import com.cucumber.pom.LoginPage;

public class PageObjectManager {

	public WebDriver driver;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	}

	private HomePage hp = null;
	private LoginPage lp = null;

	public HomePage getHomePage() {
		if (hp == null) {
			hp = new HomePage(driver);
		}
		return hp;

	}

	public LoginPage getLoginPage() {
		if (lp == null) {
			lp = new LoginPage(driver);
		}

		return lp;

	}

}
