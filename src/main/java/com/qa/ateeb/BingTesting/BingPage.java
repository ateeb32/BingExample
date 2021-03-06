package com.qa.ateeb.BingTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BingPage {
	
	@FindBy(id = "sb_form_q")
	private WebElement searchBox;
	
	@FindBy(xpath = "//*[@id=\"sb_form_go\"]")
	private WebElement searchButton;
	
	public void searchFor(String text) {
		
		searchBox.sendKeys(text);
		searchButton.submit();
		
	}

}
