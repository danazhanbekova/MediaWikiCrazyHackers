package com.MediaWiki.step_definitions;

import com.MediaWiki.pages.PageInformationPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PageInformationStepDef {
	PageInformationPage page = new PageInformationPage();
	
	@When("^I click on Page Information$")
	public void i_click_on_Page_Information() {
	    page.
	}

	@Then("^I should see that title changed for \"([^\"]*)\"Main Page\\\"([^\"]*)\"$")
	public void i_should_see_that_title_changed_for_Main_Page(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see next \"([^\"]*)\":$")
	public void i_should_see_next(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see that \"([^\"]*)\" is presented$")
	public void i_should_see_that_is_presented(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Table is matching \"([^\"]*)\" table:$")
	public void table_is_matching_table(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
