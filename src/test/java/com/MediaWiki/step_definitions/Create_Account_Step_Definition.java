package com.MediaWiki.step_definitions;


import com.MediaWiki.pages.HomePage;
import com.MediaWiki.utilities.ConfigurationReader;
import com.MediaWiki.utilities.Driver;
import com.MediaWiki.utilities.NumbersUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Create_Account_Step_Definition {

	HomePage homePage = new HomePage();
<<<<<<< HEAD
	//CreateAccountPage account = new CreateAccountPage();
	NumbersUtil number = new NumbersUtil();
	
	
=======
	CreateAccountPage account = new CreateAccountPage();

>>>>>>> branch 'master' of https://github.com/danazhanbekova/MediaWikiCrazyHackers.git
	@Given("^I open a MediaWiki page$")
	public void i_open_a_MediaWiki_page() {
		System.out.println("Loged into MediaWiki");
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/danazhanbekova/MediaWikiCrazyHackers.git
	}

	@When("^I click on Create Account link$")
	public void i_click_on_Create_Account_link() {
<<<<<<< HEAD
		homePage.createAccount.click();
=======
		account.createAccount.click();
		assertEquals(
				"http://34.223.219.142:1022/mediawiki/index.php?title=Special:CreateAccount&returnto=Special%3AUpload",
				Driver.getDriver().getCurrentUrl());

>>>>>>> branch 'master' of https://github.com/danazhanbekova/MediaWikiCrazyHackers.git
	}

	@When("^I enter registration credentials in the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
<<<<<<< HEAD
	public void i_enter_registration_credentials_in_the() {
	    
=======
	public void i_enter_registration_credentials_in_the(String arg1, String arg2, String arg3) {

>>>>>>> branch 'master' of https://github.com/danazhanbekova/MediaWikiCrazyHackers.git
	}

	@Then("^I should get failure message \"([^\"]*)\"$")
<<<<<<< HEAD
	public void i_should_get_failure_message() {
	    
=======
	public void i_should_get_failure_message(String arg1) {

>>>>>>> branch 'master' of https://github.com/danazhanbekova/MediaWikiCrazyHackers.git
	}
<<<<<<< HEAD
	
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
=======
}
>>>>>>> branch 'master' of https://github.com/danazhanbekova/MediaWikiCrazyHackers.git
