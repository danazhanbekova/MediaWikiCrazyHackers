package com.MediaWiki.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.JsonException;

import com.MediaWiki.pages.HomePage;
import com.MediaWiki.pages.PrintableVersionPage;
import com.MediaWiki.utilities.BrowserUtils;
import com.MediaWiki.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrintableVersionStepDef {

	HomePage homePage = new HomePage();
	PrintableVersionPage print = new PrintableVersionPage();

	@When("^I click on Printable Version$")
	public void i_click_on_Printable_Version() {
		homePage.printableVersion.click();
//		Alert alert = Driver.getDriver().switchTo().alert();
		BrowserUtils.waitForPageToLoad(4);
//		alert.accept();
		// WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
		// wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		// Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().toArray()[0].toString());
		// Actions action = new Actions(Driver.getDriver());
		// action.moveToElement(print.cancelButton).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) (Driver.getDriver());
		js.executeScript("arguments[0].click();", print.printButton);
	}

	@Then("^Print and cancel buttons should be visible$")
	public void print_and_cancel_buttons_should_be_visible() {
		assertTrue(print.printButton.isDisplayed());
		assertTrue(print.cancelButton.isDisplayed());
		/*
		 * wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		 * driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		 * assertTrue(home.printButton.isDisplayed());
		 * assertTrue(home.aLLRadioButton.isSelected());
		 * driver.switchTo().frame("pdf-viewer");
		 * assertTrue(home.printPage.isDisplayed()); driver.switchTo().defaultContent();
		 * home.cancelButton.click(); Thread.sleep(2000);
		 * driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		 */
	}

	@Then("^Radio button All should be selected$")
	public void radio_button_All_should_be_selected() {
		print.allRadioButton.isSelected();
	}

	@When("^I hover to Layout dropdown element and press it$")
	public void i_hover_to_Layout_dropdown_element_and_press_it() {
		print.layoutDropdown.click();
	}

	@Then("^I should see two options Portrait and Landscape$")
	public void i_should_see_two_options_Portrait_and_Landscape() {
		assertEquals(print.layoutOptions.size(), 2);
		assertTrue(print.layoutOptions.get(0).toString().equals("Portrait"));
		assertTrue(print.layoutOptions.get(1).toString().equals("Landscape"));
	}

	@When("^I hover to Color dropdown element and press it$")
	public void i_hover_to_Color_dropdown_element_and_press_it() {

	}

	@Then("^I should see two options Color and Black and White$")
	public void i_should_see_two_options_Color_and_Black_and_White() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	// Scenario 2

	@Then("^Print page is visible$")
	public void print_page_is_visible() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I hover to More settings and press it$")
	public void i_hover_to_More_settings_and_press_it() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see Paper size dropdown$")
	public void i_should_see_Paper_size_dropdown() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^It should have (\\d+) options$")
	public void it_should_have_options(int arg1) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I hover to Margins dropdown and press it$")
	public void i_hover_to_Margins_dropdown_and_press_it() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see \"([^\"]*)\" selected by default$")
	public void i_should_see_selected_by_default(String arg1) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Scale should have a value (\\d+)$")
	public void scale_should_have_a_value(int arg1) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^option Header and footer should be checked$")
	public void option_Header_and_footer_should_be_checked() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^optoin Background graphics should be unchecked$")
	public void optoin_Background_graphics_should_be_unchecked() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
