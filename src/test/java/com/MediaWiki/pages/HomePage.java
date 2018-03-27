package com.MediaWiki.pages;

import org.openqa.selenium.support.PageFactory;

import com.MediaWiki.utilities.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
}
