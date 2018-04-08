package com.MediaWiki.step_definitions;

import static org.testng.Assert.assertTrue;

import com.MediaWiki.pages.FileUploadPage;
import com.MediaWiki.pages.HomePage;
import com.MediaWiki.utilities.BrowserUtils;
import com.MediaWiki.utilities.ConfigurationReader;
import com.MediaWiki.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UploadingFileStepDefs {
	HomePage homePage = new HomePage();
	FileUploadPage fileUploadPage = new FileUploadPage();

	@Given("^I should log into WikiMedia$")
	public void i_should_log_into_WikiMedia() {
		System.out.println("Loged into WikiMedia");
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		homePage.logIn.click();
		homePage.loginMethod(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
		fileUploadPage.uploadFile.click();
	}

	@When("^Logo for page should be visible$")
	public void logo_for_page_should_be_visible() {
		assertTrue(fileUploadPage.logo.isDisplayed(), "Logo doesn't displayed");
	}

	@Then("^I press upload file section$")
	public void i_press_upload_file_section() {
		fileUploadPage.uploadFileMethod();

	}

	@Then("^I upload groups logo$")
	public void i_upload_groups_logo() {
		fileUploadPage.file.click();
		assertTrue(fileUploadPage.fileUpload.isDisplayed(), "is not displayed");

	}

	@Then("^I logout from browser$")
	public void i_logout_from_browser() {
		BrowserUtils.waitFor(4);
		fileUploadPage.logOut.click();

	}

	@Then("^menu options should be visible$")
	public void menu_options_should_be_visible() {
		assertTrue(fileUploadPage.mainPage.isDisplayed(), "is not displayed");
		assertTrue(fileUploadPage.recentChanges.isDisplayed(), "is not displayed");
		assertTrue(fileUploadPage.randomPage.isDisplayed(), "is not displayed");
		assertTrue(fileUploadPage.help.isDisplayed(), "is not displayed");
		assertTrue(fileUploadPage.mainPage.isDisplayed(), "is not displayed");
		assertTrue(fileUploadPage.specailPages.isDisplayed(), "is not displayed");
		assertTrue(fileUploadPage.printableVersion.isDisplayed(), "is not displayed");
	}

}