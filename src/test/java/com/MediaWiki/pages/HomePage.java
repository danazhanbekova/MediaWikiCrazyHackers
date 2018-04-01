package com.MediaWiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MediaWiki.utilities.Driver;
import com.MediaWiki.utilities.NumbersUtil;

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
	
	@FindBy(linkText = "create this page")
	public WebElement createPage;
	
	@FindBy(linkText = "search the related logs")
	public WebElement searchRelatedLogs;
	
	@FindBy(linkText = "search for this page title")
	public WebElement searchPageTitle;
	
	
	
	

	public void loginMethod(String username, String pwd) {
		userName.sendKeys(username);
		password.sendKeys(pwd);
		logInBtn.click();

	}
	
	String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	String specialChars = "!@#$%^&*(_";
	String numbers = "0123456789";
	NumbersUtil numsUtil = new NumbersUtil();
	
	public String getRandomUppercaseLetters(int count) {
		String randomUpperstr = "";
		for (int i = 1; i <= count; i++) {
		int ranNum = numsUtil.getRandomInt(25);
		randomUpperstr = randomUpperstr+upperCaseLetters.charAt(ranNum);
		}
		return randomUpperstr;
	}
	

	public String getRandomLowercaseLetters(int count) {
		String randomLowerstr = "";
		for (int i =1; i<=count; i++){
			int ranNum2 = numsUtil.getRandomInt(25);
			randomLowerstr = randomLowerstr + lowerCaseLetters.charAt(ranNum2);
		}
		return randomLowerstr;
	}
	
	public String getRandomSpecialChars(int count) {
		String randomScecial = "";
		for( int i = 1; i <= count; i++){
	    int ranScecial = numsUtil.getRandomInt(specialChars.length()-1); 
			randomScecial += specialChars.charAt(ranScecial);
		}
		return randomScecial;
	}
	
	public String getRandomNumbers(int count) {
		String ranNum ="";
		for (int i = 1; i<=count; i++){
			int randomNumbers = numsUtil.getRandomInt(numbers.length()-1);
			ranNum +=numbers.charAt(randomNumbers);
		}
		return ranNum;
	}
	
	public String generatePassword(int upper, int lower, int special, int num) {
		
		
		return getRandomUppercaseLetters(upper)+getRandomLowercaseLetters(lower)+getRandomSpecialChars(special)+getRandomNumbers(num);
	}
	
}


