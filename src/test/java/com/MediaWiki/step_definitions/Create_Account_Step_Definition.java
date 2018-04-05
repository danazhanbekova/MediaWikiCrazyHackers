package com.MediaWiki.step_definitions;


import com.MediaWiki.pages.HomePage;
import com.MediaWiki.utilities.ConfigurationReader;
import com.MediaWiki.utilities.Driver;
import com.MediaWiki.utilities.NumbersUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Create_Account_Step_Definition{

	HomePage homePage = new HomePage();
	//CreateAccountPage account = new CreateAccountPage();
	NumbersUtil number = new NumbersUtil();
	
	
	@Given("^I open a MediaWiki page$")
	public void i_open_a_MediaWiki_page() {
		System.out.println("Loged into MediaWiki");
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@When("^I click on Create Account link$")
	public void i_click_on_Create_Account_link() {
		homePage.createAccount.click();
	}

	@When("^I enter registration credentials in the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_enter_registration_credentials_in_the() {
	    
	}

	@Then("^I should get failure message \"([^\"]*)\"$")
	public void i_should_get_failure_message() {
	    
	}
	
	// 2nd
	
	
	@When("^I create a new account with random username$")
	public void i_create_a_new_account_with_random_username() {
		
		homePage.createAccount.click();
		homePage.userName.sendKeys((homePage.getRandomLowercaseLetters(10)));
		homePage.password.sendKeys("abc123");
		homePage.confirmPassword.sendKeys("abc123");
		homePage.createYourAccount.click();
	}

	@Then("^I should be able to create a new account$")
	public void i_should_be_able_to_create_a_new_account() {
		homePage.newAccount.isDisplayed();
	}
}
