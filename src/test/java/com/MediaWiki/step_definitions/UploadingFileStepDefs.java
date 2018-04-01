 package com.MediaWiki.step_definitions;

import com.MediaWiki.pages.FileUploadPage;
import com.MediaWiki.pages.HomePage;
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
		homePage.loginMethod(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
		fileUploadPage.fileUpload.click();
	}

	@When("^Logo for page should be visible$")
	public void logo_for_page_should_be_visible() {

	}

	@Then("^I press upload file section$")
	public void i_press_upload_file_section() {

	}

	@Then("^I upload groups logo$")
	public void i_upload_groups_logo() {

	}

	@Then("^I logout from browser$")
	public void i_logout_from_browser() {

	}
}
