package com.MediaWiki.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.MediaWiki.pages.CreateNewPage;
import com.MediaWiki.pages.HomePage;
import com.MediaWiki.utilities.ConfigurationReader;
import com.MediaWiki.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CreatePageStepDefs {
	String pageSuffix = "";
	String createURL ="http://34.223.219.142:1022/mediawiki/index.php/";
	@Given("^I log into MediaWiki$")
	public void i_log_into_MediaWiki() {
		HomePage homePage = new HomePage();
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		homePage.logIn.click();
		homePage.loginMethod(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
	}

	@When("^I create a \"([^\"]*)\"$")
	public void i_create_a(String pagePrefix) {
		pageSuffix = new Random()+"";
		Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Driver.getDriver().get(createURL+"RandomPage"+pagePrefix+pageSuffix);
		boolean b=false;
		while(b==false) {

			try {
				b = Driver.getDriver().findElement(By.linkText("create this page")).isDisplayed();
			} catch (Exception e) {
				pageSuffix = new Random()+"";
				Driver.getDriver().get(createURL+"RandomPage"+pagePrefix+pageSuffix);
			}
	}
		Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		Driver.getDriver().findElement(By.linkText("create this page")).click();	
	}
	
	@And("^I should be able to use \"([^\"]*)\" in the Main Text Box that will create Special Features$")
	public void i_should_be_able_to_use_in_the_Main_Text_Box_that_will_create_Special_Features(String specialCommands) {
		CreateNewPage createnewpage = new CreateNewPage();
		createnewpage.wpTextbox1.sendKeys(specialCommands);
		createnewpage.wpSave.click();
		assertTrue(CreateNewPage.ifBold(specialCommands.replaceAll("'", "")));	
	
	}

	@Then("^I should be able to navigate to that \"([^\"]*)\"$")
	public void i_should_be_able_to_navigate_to_that(String pagePrefix) {
		Driver.getDriver().get(createURL+pagePrefix+pageSuffix);
		assertEquals(pagePrefix+pageSuffix+" - Cybertek's Wiki!",Driver.getDriver().getTitle());
	}

	@When("^I attempt to  a create a \"([^\"]*)\" that already exists$")
	public void i_attempt_to_a_create_a_that_already_exists(String pagePrefix) {
		Driver.getDriver().get(createURL+pagePrefix);
		boolean b =true;
		try {
			Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			b=Driver.getDriver().findElement(By.linkText("create this page")).isDisplayed();
		} catch (Exception e) {
			b=false;
			
		}
		assertFalse(b);
		Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Then("^I should be taken to that \"([^\"]*)\" directly$")
	public void i_should_be_taken_to_that_directly(String pagePrefix) {
		assertEquals(pagePrefix+pageSuffix+" - Cybertek's Wiki!",Driver.getDriver().getTitle());
	}

}
