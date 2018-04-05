package com.MediaWiki.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrintableVersionPage {
	
	@FindBy ( xpath = "//button[.='Print']")
	public WebElement printButton;
	
	@FindBy ( xpath = "//button[.='Cancel']")
	public WebElement cancelButton;
	
	@FindBy ( xpath = "//input[@class='page-settings-all-radio']")
	public WebElement allRadioButton;
	
	@FindBy ( xpath = "//select[@class='layout-settings-select']")
	public WebElement layoutDropdown;
	
	@FindBy ( xpath = "//select[@class='layout-settings-select']//option")
	public List<WebElement> layoutOptions;
	
	@FindBy ( xpath = "//select[@class='color-settings-select']")
	public WebElement colorDropdown;
	
	@FindBy ( xpath = "//select[@class='color-settings-select']//option")
	public List<WebElement> colorOptions;
	

}
