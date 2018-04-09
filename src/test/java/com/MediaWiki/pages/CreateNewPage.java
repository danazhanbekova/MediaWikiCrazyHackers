package com.MediaWiki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.MediaWiki.utilities.Driver;

public class CreateNewPage {
	public CreateNewPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	public WebElement wpTextbox1;
	
	public WebElement wpSave;
	
	
	
	public static boolean ifBold(String linkText) {
		try {
			Driver.getDriver().findElement(By.xpath("//b[.='"+linkText+"']")).isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	
	
	
}
