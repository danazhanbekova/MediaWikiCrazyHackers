package com.MediaWiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MediaWiki.utilities.Driver;

public class UserHelp {
	public UserHelp() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText="Help")
	public WebElement helpButton;

	@FindBy(xpath = "//span[@class='mw-headline'][@id='Reading']")
	public WebElement ReadingOption;

	@FindBy(xpath = "//*[@id='Editing']")
	public WebElement EditingOption;

	@FindBy(xpath = "//*[@id='Collaboration']")
	public WebElement CollaborationOption;

	@FindBy(xpath = "//*[@id='Personal_customization']")
	public WebElement PersonalCustomizationOption;

	@FindBy(xpath = "//*[@id='Wiki_administration']")
	public WebElement WikiAdministrationOption;

	@FindBy(xpath = "//*[@id=\"mw-content-text\"]/div[2]/ul[1]/li[2]")
	public WebElement SearchingButton;

	@FindBy(xpath = "//*[@id=\"How_it_works\"]")
	public WebElement Headline1;

	@FindBy(xpath = "//*[@id=\"Restricting_the_search\"]")
	public WebElement Headline2;

}
