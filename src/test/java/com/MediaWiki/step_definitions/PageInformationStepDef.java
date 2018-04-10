package com.MediaWiki.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.MediaWiki.pages.HomePage;
import com.MediaWiki.pages.PageInformationPage;
import com.MediaWiki.utilities.Driver;
import com.MediaWiki.utilities.BrowserUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PageInformationStepDef {
	PageInformationPage page = new PageInformationPage();
	HomePage home = new HomePage();
	
	@When("^I click on Page Information$")
	public void i_click_on_Page_Information() {
	   home.pageInformation.click();
	}
	
	@Then("^title should contain \"([^\"]*)\"$")
	public void title_should_contain(String expected) {
		assertTrue(Driver.getDriver().getTitle().contains(expected));
		 
	}

	@Then("^I should see next:$")
	public void i_should_see_next(List<String> option) {
		List<String> actualOptionsString = BrowserUtils.getElementsText(page.headers());
		assertEquals(actualOptionsString.size(), option.size(), "Number of expected menu options did not match");
	    for (int i =0; i<option.size(); i++) {
	    	if(actualOptionsString.get(i)!=null) {
         	assertEquals(actualOptionsString.get(i), option.get(i));
	    	}
		}
	}

	@Then("^I should see that logo is presented$")
	public void i_should_see_that_logo_is_presented() {
		assertTrue(page.imageIsPresented());
	}

	@Then("^Table is matching next table:$")
	public void table_is_matching_next_table(List<String> expected) {
		List<String> actualOptionsString = BrowserUtils.getElementsText(page.bigTable());
	    for (int i =0; i<actualOptionsString.size(); i++) {
	    	if(i%2!=0) {
         	assertTrue(actualOptionsString.containsAll(expected));
	    	}
		}
	}

}
