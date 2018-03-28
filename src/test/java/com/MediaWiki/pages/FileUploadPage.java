package com.MediaWiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MediaWiki.utilities.Driver;

public class FileUploadPage {
	public FileUploadPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText = "Upload file")
	public WebElement fileUpload;
}
