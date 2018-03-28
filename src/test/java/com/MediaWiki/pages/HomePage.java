package com.MediaWiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MediaWiki.utilities.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText = "Log in")
	public WebElement logIn;

	@FindBy(id = "wpName1")
	public WebElement userName;

	@FindBy(id = "wpPassword1")
	public WebElement password;

	@FindBy(id = "wpLoginAttempt")
	public WebElement logInBtn;

	public void loginMethod(String username, String pwd) {
		userName.sendKeys(username);
		password.sendKeys(pwd);
		logInBtn.click();

	}

}
