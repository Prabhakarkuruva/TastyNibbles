package com.TastyNibbles.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page5Objects {
	@FindBy(xpath="//div[@class=\"cart_item-sub cartitem-row cart_item--subtotal\"]")
	public WebElement total;
	

}