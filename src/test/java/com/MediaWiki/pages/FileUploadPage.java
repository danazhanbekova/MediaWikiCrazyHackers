package com.MediaWiki.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.MediaWiki.utilities.BrowserUtils;
import com.MediaWiki.utilities.Driver;

public class FileUploadPage {
	public FileUploadPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText = "Upload file")
	public WebElement uploadFile;

	@FindBy(className = "mw-wiki-logo")
	public WebElement logo;

	@FindBy(xpath = "//input[@id='wpUploadFile']")
	public WebElement chooseFileBtn;

	@FindBy(xpath = "//textarea[@id='wpUploadDescription']")
	public WebElement summary;

	@FindBy(xpath = "//select[@id='wpLicense']")
	public WebElement licensing;

	@FindBy(xpath = "//label[@for='wpWatchthis']")
	public WebElement watchThisFileOption;

	@FindBy(xpath = "//label[@for='wpIgnoreWarning']")
	public WebElement ignoreAnyWarnings;

	@FindBy(xpath = "//input[@name='wpUpload']")
	public WebElement uploadFileBtn;

	@FindBy(xpath = "//*[@id=\"filetoc\"]/li[1]/a")
	public WebElement file;

	@FindBy(xpath = "//a//img[@alt='File:MyLogo.jpg']")
	public WebElement fileUpload;

	@FindBy(linkText = "Log out")
	public WebElement logOut;

	@FindBy(linkText = "Main page")
	public WebElement mainPage;

	@FindBy(linkText = "Recent changes")
	public WebElement recentChanges;

	@FindBy(linkText = "Random page")
	public WebElement randomPage;

	@FindBy(linkText = "Help")
	public WebElement help;

	@FindBy(linkText = "Special pages")
	public WebElement specailPages;

	@FindBy(linkText = "Printable version")
	public WebElement printableVersion;

	String filePath = "/Users/MarifatAzamatuulu/Desktop/myLogo.jpg";

	public void uploadFileMethod() {
		chooseFileBtn.sendKeys(filePath);
		summary.sendKeys("Cybertek Demo Phase 3 is coming");
		Select list = new Select(licensing);
		list.selectByIndex(0);
		 watchThisFileOption.click();
		BrowserUtils.waitFor(5);

		ignoreAnyWarnings.click();
		BrowserUtils.waitFor(5);
		assertTrue(ignoreAnyWarnings.isEnabled(), "'Watch this file' is selected after clicking");
		uploadFileBtn.click();
		BrowserUtils.waitFor(4);

	}

}
