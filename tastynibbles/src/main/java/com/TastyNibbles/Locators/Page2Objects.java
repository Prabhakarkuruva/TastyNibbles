package com.TastyNibbles.Locators;


import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import com.TastyNibbles.Browser.Browser;

public class Page2Objects extends Browser {

	@FindBy(id="CustomerEmail")
	public WebElement login_email;
	@FindBy(id="CustomerPassword")
	public WebElement login_password;
	@FindBy(xpath="//*[@id=\"customer_login\"]/p[1]/button")
	public WebElement Sign_In;
	@FindBy(xpath="//input[@type=\"search\"]")
	public WebElement search;
	@FindBy(xpath="//div[@class=\"new-grid search-grid\"]")
	public WebElement resultsPage;
	@FindAll(@FindBy(xpath="//div[@class=\"new-grid search-grid\"]/div"))
	public List <WebElement> itemInList;
	@FindBy(xpath="//button[@name=\"add\"]")
	public  WebElement addToCartButton;
	@FindBy(id="HeaderCartTrigger")
	public WebElement cartbutton;
	@FindBy(xpath="//div[@class=\"cart__items\"]/div")
	public List <WebElement> item_in_cart;
	@FindBy(xpath="//button[@class=\"site-nav_link site-nav_link--icon js-close-header-cart\"]")
	public  WebElement cart_close;
	
	
	
}





































//
//import java.util.List;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindAll;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.TastyNibbles.Browser.Browser;
//
//public class Page2Objects extends Browser {
//	
//	public Page2Objects() {
//		PageFactory.initElements(driver, this);//Initializes the elements of a page object class.
//	}
//	@FindBy(id="CustomerEmail")//To locate elements on a web page.
//	public WebElement login_email;
//	@FindBy(id="CustomerPassword")
//	public WebElement login_password;
//	@FindBy(xpath="//form[@id=\"customer_login\"]/p[1]/button")
//	public WebElement Sign_In;
//	@FindBy(xpath="//input[@type=\"search\"]")
//	public WebElement search;
//	@FindBy(xpath="	//div[@class=\"new-grid search-grid\"]")
//	public WebElement resultsPage;
//	@FindAll(@FindBy(xpath="//div[@class=\"new-grid search-grid\"]/div[2]"))
//	public List <WebElement> itemInList;
//	@FindBy(xpath="//button[@name='add']")
//	public  WebElement addToCartButton;
//	@FindBy(xpath="//a[@id=\"HeaderCartTrigger\"]")
//	public static WebElement cartButton;
//	@FindBy(xpath="//div[@class=\"cart__items\"}")
//	public  static WebElement cart;
//	@FindAll(@FindBy(xpath="//div[@class=\"cart__items\"]/div"))
//	public List <WebElement> cartItems;	
//	@FindBy(xpath="//button[@class=\"site-nav_link site-nav_link--icon js-close-header-cart\"]")
//	public static WebElement closeCart;
//
//}