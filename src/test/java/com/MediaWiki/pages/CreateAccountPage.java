package com.MediaWiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MediaWiki.utilities.Driver;

public class CreateAccountPage {

	public CreateAccountPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id='pt-createaccount']/a")
	public WebElement createAccount;
	
}
