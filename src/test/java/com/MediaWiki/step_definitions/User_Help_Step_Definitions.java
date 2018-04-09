package com.MediaWiki.step_definitions;

import static org.testng.Assert.assertTrue;

import com.MediaWiki.pages.HomePage;
import com.MediaWiki.pages.UserHelp;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class User_Help_Step_Definitions {

	HomePage homePage = new HomePage();
	UserHelp userHelp = new UserHelp();

	@When("^I clicked on  help button$")
	public void i_clicked_on_help_button() {
		
		userHelp.helpButton.click();
	}

	@Then("^help options on the result page should be visible$")
	public void help_options_on_the_result_page_should_be_visible() {
		assertTrue(userHelp.ReadingOption.isDisplayed(), "Reading is not displayed");
		assertTrue(userHelp.EditingOption.isDisplayed(), "Editing is not displayed");
		assertTrue(userHelp.CollaborationOption.isDisplayed(), "Collaboration is not displayed");
		assertTrue(userHelp.PersonalCustomizationOption.isDisplayed(), "PersonalCustomization is not displayed");
		assertTrue(userHelp.WikiAdministrationOption.isDisplayed(), "WikiAdministration is not displayed");
	}
}