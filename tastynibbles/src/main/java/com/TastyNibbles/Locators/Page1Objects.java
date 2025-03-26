package com.TastyNibbles.Locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TastyNibbles.Browser.Browser;

public class Page1Objects extends Browser {
	public Page1Objects() {
		PageFactory.initElements(driver, this);//Initializes the elements of a page object class.
	}
	@FindBy(xpath="//a[@href='/account']")//To locate elements on a web page.
	 public WebElement account_link;
	@FindBy(xpath="//a[text()='Create account']")
	public WebElement create_account_link;
	@FindBy(name="customer[first_name]")
	public WebElement first_name ;
	@FindBy(id="LastName")
	public WebElement last_name ;
	@FindBy(id="Email")
	public WebElement email;
	@FindBy(id="CreatePassword")
	public WebElement password;
	@FindBy(xpath="//input[@value='Create']")
	public WebElement create_button;
	@FindBy(xpath="//div[@class='errors']")
	public WebElement errors;
	@FindBy(xpath="//img[@alt='Tasty Nibbles']")
	public WebElement success;
	
}
