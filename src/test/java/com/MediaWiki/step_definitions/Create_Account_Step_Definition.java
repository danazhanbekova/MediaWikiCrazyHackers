package com.MediaWiki.step_definitions;

import static org.testng.Assert.assertEquals;

import com.MediaWiki.pages.CreateAccountPage;
import com.MediaWiki.pages.HomePage;
import com.MediaWiki.utilities.ConfigurationReader;
import com.MediaWiki.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Create_Account_Step_Definition{

	HomePage homePage = new HomePage();
	CreateAccountPage account = new CreateAccountPage();
	
	@Given("^I open a MediaWiki page$")
	public void i_open_a_MediaWiki_page() {
		System.out.println("Loged into MediaWiki");
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		
	}

	@When("^I click on Create Account link$")
	public void i_click_on_Create_Account_link() {
		account.createAccount.click();
		assertEquals("http://34.223.219.142:1022/mediawiki/index.php?title=Special:CreateAccount&returnto=Special%3AUpload", Driver.getDriver().getCurrentUrl());
		
	}

	@When("^I enter registration credentials in the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_enter_registration_credentials_in_the(String arg1, String arg2, String arg3) {
	    
	}

	@Then("^I should get failure message \"([^\"]*)\"$")
	public void i_should_get_failure_message(String arg1) {
	    
	}
}
