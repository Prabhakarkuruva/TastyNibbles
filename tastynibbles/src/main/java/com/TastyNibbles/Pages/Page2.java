package com.TastyNibbles.Pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.TastyNibbles.Browser.Browser;
import com.TastyNibbles.Locators.Page2Objects;
import com.TastyNibbles.ScreenShot.Capture;

public class Page2 extends Browser {
    static Page2Objects obj;
    static WebDriverWait wait;
    public static String selectedProductName;
  //This method for entering the email 
    public static void enterEmail(String email) {
   	obj=PageFactory.initElements(driver, Page2Objects.class);
    	wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        try {
            wait.until(ExpectedConditions.visibilityOf(obj.login_email));

            obj.login_email.sendKeys(email);
        } catch (Exception e) {
            System.out.println("Email: " + e.getMessage());
        }
    }
  //This method for entering the password 
    public static void enterPassword(String password) {
        try {
            wait.until(ExpectedConditions.visibilityOf(obj.login_password));
            obj.login_password.sendKeys(password);
        } catch (Exception e) {
            System.out.println("Password: " + e.getMessage());
        }
    }
  //This method for click on signIn button  
    public static void signIn() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(obj.Sign_In));
            obj.Sign_In.click();
        } catch (Exception e) {
            System.out.println("Sign In Button: " + e.getMessage());
        }
    }
  //This method for searching item 
    public static void searchItem(String item) {
        try {
            wait.until(ExpectedConditions.visibilityOf(obj.search));
            obj.search.sendKeys(item, Keys.ENTER);
        } catch (Exception e) {
            System.out.println("Search Item: " + e.getMessage());
        }
    }
  //This method for selecting an item from the above search results 
    public static void selectItem(String item) {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements(obj.itemInList));
            for (WebElement product : obj.itemInList) {
                if (product.getText().contains(item)) {
                    // Save only the product name
                    String productName = product.getText().split("\n")[0]; //First retrieves data and next Splits the text into an array of strings using the newline character (\n) as the delimiter and next select array of element by using index 
                    selectedProductName = productName; 
                    product.click();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Select Item: " + e.getMessage());
        }
    }

  //This method for item is adding to the cart
    public static void addToCart() {
        try {
            wait.until(ExpectedConditions.visibilityOf(obj.addToCartButton));
            obj.addToCartButton.click();
            Capture.screenShot(selectedProductName);

        } catch (Exception e) {
            System.out.println("Add to Cart: " + e.getMessage());
        }
    }
    //This method for clicking the cart button
    public static void clickCart() {
        try {
            wait.until(ExpectedConditions.visibilityOf(obj.cartbutton));
            obj.cartbutton.click();

        } catch (Exception e) {
            System.out.println("Cart button: " + e.getMessage());
        }
    }
  //This method for verifying the cart items 
    public static void verifyCart(String productName) {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements(obj.item_in_cart));
            boolean isFound = false;
            for (WebElement product : obj.item_in_cart) {
                String cartProductText = product.getText().trim();
                System.out.println("Cart Product: " + cartProductText);
                if (cartProductText.contains(productName)) {
                    isFound = true;
                    System.out.println("Found: " + productName);
                    break;
                }
            }
            Assert.assertTrue(isFound, "Product '" + productName + "' not found in the cart.");
        } catch (Exception e) {
            System.out.println("Error in verifying cart: " + e.getMessage());
        }
    }

    public static void cartClose() {
        try {
            wait.until(ExpectedConditions.visibilityOf(obj.cart_close));
            obj.cart_close.click();

        } catch (Exception e) {
            System.out.println("Cart close: " + e.getMessage());
        }
    }
}

































































//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import com.TastyNibbles.Browser.Browser;
//import com.TastyNibbles.Locators.Page2Objects;
//
//public class Page2 extends Browser{
//	static Page2Objects obj;
//	////This method for entering the email 
//	 public static void enterEmail(String email) {
//	        try {
//	        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CustomerEmail")));
//                obj=new Page2Objects();
//                obj.login_email.sendKeys(email);
//	            
//	        } catch (Exception e) {
//	            System.out.println("Email: " + e.getMessage());
//	        }
//	    }
//	//This method for entering the Password 
//	 public static void enterPassword(String password) {
//	        try {
//	        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	            wait.until(ExpectedConditions.visibilityOf(obj.login_password));
//	                obj.login_password.sendKeys(password);
//	            
//	        } catch (Exception e) {
//	            System.out.println("FirstName: " + e.getMessage());
//	        }
//	    }
//	//This method for clicking the signin button
//	 public static void signIn() {
//	        try {
//	        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	            wait.until(ExpectedConditions.visibilityOf(obj.Sign_In));
//	                obj.Sign_In.click();
//	            
//	        } catch (Exception e) {
//	            System.out.println("SignInButton: " + e.getMessage());
//	        }
//	    }
//	//This method for entering product name in search box  
//	 public static void searchItem(String item) {
//	        try {
//	        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	            wait.until(ExpectedConditions.visibilityOf(obj.search));
//	        	
//	                obj.search.sendKeys(item,Keys.ENTER);;
//	            
//	        } catch (Exception e) {
//	            System.out.println("Email: " + e.getMessage());
//	        }
//	    }
//	//This method for selecting item from the above results 
//	 public static void selectItem(String item) {
//		 try {
//	            JavascriptExecutor js=(JavascriptExecutor)driver;
//	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	            wait.until(ExpectedConditions.visibilityOfAllElements(obj.itemInList));
//	            for (WebElement product : obj.itemInList) {
//	                if (product.getText().contains(item)) {
//	                    js.executeScript("arguments[0].scrollIntoView(true);", product);
//	                    Thread.sleep(500);
//	                    product.click();
//	                    break;
//	                }
//	            }
//		 }
////		 try {
////			  JavascriptExecutor js=(JavascriptExecutor)driver;
////	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
////	            wait.until(ExpectedConditions.visibilityOfAllElements(obj.itemInList));
////	            for (int i = 0; i < obj.itemInList.size(); i++) {
////	                if(obj.itemInList.get(i).getText().contains(item)) {
////	                	js.executeScript("arguments[0].scrollIntoView(true);", item);
////
////	                	obj.itemInList.get(i).click();
////	                	break;
////	                }
////	            }
//	       catch (Exception e) {
//	            System.out.println("Item Select: " + e.getMessage());
//	        }
//		 
//	 }
//	 
//	//This method for add the element to the cart  
//	 public static void addToCart() {
//	        try {
//	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	            wait.until(ExpectedConditions.visibilityOf(obj.addToCartButton));
//	            Thread.sleep(2000);
//	            obj.addToCartButton.click();
//	        } catch (Exception e) {
//	            System.out.println("Add to Cart: " + e.getMessage());
//	        }
//	    }
//	//This method for verfiying the product is added to the cart or not 
//	 public static void verifyProductInCart(String productName) {
//	        try {
//	        	Thread.sleep(1000);
//	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	            wait.until(ExpectedConditions.visibilityOfAllElements(obj.cartItems));
//	            for (int i = 0; i < obj.cartItems.size(); i++) {
//	                if(obj.cartItems.get(i).getText().contains(productName)) {
//	                	Assert.assertEquals(productName,"Chicken Pickle 200g");
//	                
//	                }
//	            }
//	            
//	        } catch (Exception e) {
//	            System.out.println("Verify Product In Cart: " + e.getMessage());
//	        }
//	    }
//	 
//}