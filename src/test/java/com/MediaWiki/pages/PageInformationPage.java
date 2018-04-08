package com.MediaWiki.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageInformationPage {
	
	@FindBy( xpath = "//span[@class='mw-headline']")
	public WebElement headers;
	
	@FindBy( xpath = "//a[.='MediaWiki default']")
	public WebElement mediaWikiDefault;
	
	@FindBy( xpath = "(//table[@class='wikitable mw-page-info'])[3]//td")
	public List<WebElement> bigTable;
	
	@FindBy( xpath = "//a[.='Number of redirects to this page']")
	public WebElement numberofRedirects;

}
