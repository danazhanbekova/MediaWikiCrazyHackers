package com.MediaWiki.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.MediaWiki.utilities.Driver;

public class PageInformationPage {
	
	public List<WebElement> headers(){
		String xpath = "//span[@class='mw-headline']";
		return Driver.getDriver().findElements(By.xpath(xpath));
	}
	
	@FindBy( xpath = "//a[.='MediaWiki default']")
	public WebElement mediaWikiDefault;
	
	public boolean imageIsPresented() {
		WebElement image = Driver.getDriver().findElement(By.xpath("//img[@alt='Powered by MediaWiki']"));
		if(image!=null) {
			return image.isDisplayed();
		}
		return false;
	}
	
	public List<WebElement> bigTable(){
		String xpath = "(//table[@class='wikitable mw-page-info'])[3]//td";
		return Driver.getDriver().findElements(By.xpath(xpath));
	}
	
	public WebElement numberofRedirects() {
		String linkText = "Number of redirects to this page";
		return Driver.getDriver().findElement(By.linkText(linkText));
	}

}
