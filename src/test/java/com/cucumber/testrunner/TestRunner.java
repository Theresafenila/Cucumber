package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.utils.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src\\test\\java\\com\\cucumber\\features\\" }, glue = { "com.cucumber.stepdefinition" }, tags = {
				"@demo,TC1" , "~@Ignore"}, strict = true, monochrome = true
// ,dryRun=true
)

// AND = "@demo","TC1" - It will run only scenarios with contains both tags
// OR =  "@demo,TC1"   - it will run scenarios with contains any of the tags

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = BaseClass.launchBrowser("chrome");
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
