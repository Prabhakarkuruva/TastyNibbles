package com.TastyNibbles.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TastyNibbles.Browser.Browser;

public class Page3Objects extends Browser {
	public Page3Objects() {
		PageFactory.initElements(driver, this);//Initializes the elements of a page object class.
	}
	
	@FindBy(xpath="//a[@href=\"/account/logout\"]")//To locate elements on a web page.
	public static WebElement logout;

	   
}