package com.TastyNibbles.Pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.TastyNibbles.Browser.Browser;
import com.TastyNibbles.Locators.Page1Objects;
import com.aventstack.extentreports.Status;

public class Page1 extends Browser {
	static Page1Objects obj;
	//This method for clicking the Account
    public static void clickingAccount() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("To clicking Account link");
		logger1.log(Status.INFO,"To clicking Account link");
        try {
                 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/account\"]")));
                obj=new Page1Objects();
                obj.account_link.click();
                logger1.log(Status.PASS,"Successfully clicked account link");
           
        } catch (Exception e) {
            System.out.println("Account link: " + e.getMessage());
            logger1.log(Status.FAIL,"unable to click account link");
        }
        extent.flush();
    }
  //This method for clicking the Create Account
    public static void clickingCreationAccount() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("To clicking Create Account link");
		logger1.log(Status.INFO,"To clicking Create Account link");
        try {
        	
        	 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/account/register\"]")));
             obj=new Page1Objects();
             obj.create_account_link.click();
             logger1.log(Status.PASS,"Successfully clicked Create Account link");
            
        } catch (Exception e) {
            System.out.println("Create Account link: " + e.getMessage());
            logger1.log(Status.FAIL,"unable to click create account link");
        }
        extent.flush();
    }
  //This method for entering the First name
    public static void enterFirstName(String firstname) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("To entering first name");
		logger1.log(Status.INFO,"To entering first name");
        try {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(obj.first_name));
                obj.first_name.sendKeys(firstname);
                logger1.log(Status.PASS,"Successfully entered first name ");
            
        } catch (Exception e) {
            System.out.println("FirstName: " + e.getMessage());
            logger1.log(Status.FAIL,"unable to enter first name");
        }
        extent.flush();
    }
    //This method for entering the Last Name 
    public static void enterLastName(String laststname) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("To entering last name");
		logger1.log(Status.INFO,"To entering last name");
        try {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(obj.last_name));
                obj.last_name.sendKeys(laststname);
                logger1.log(Status.PASS,"Successfully entered last name ");
            
        } catch (Exception e) {
            System.out.println("FirstName: " + e.getMessage());
            logger1.log(Status.FAIL,"unable to enter last name");
        }
        extent.flush();
    }
  //This method for entering the Email 
    public static void enterEmail(String email) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("To entering Email");
		logger1.log(Status.INFO,"To entering Email");
        try {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(obj.email));
        	
                obj.email.sendKeys(email);
                logger1.log(Status.PASS,"Successfully entered Email");
            
        } catch (Exception e) {
            System.out.println("Email: " + e.getMessage());
            logger1.log(Status.FAIL,"unable to enter Email");
        }
        extent.flush();
    }
  //This method for entering the Password 
    public static void enterPassword(String password) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("To entering password");
		logger1.log(Status.INFO,"To entering password");
        try {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(obj.password));
                obj.password.sendKeys(password);
                logger1.log(Status.PASS,"Successfully entered password");
            
        } catch (Exception e) {
            System.out.println("Password: " + e.getMessage());
            logger1.log(Status.FAIL,"unable to enter password");
        }
        extent.flush();
    }
  //This method for to clicking the create account
    public static void createAccount() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("To clicking create Account link");
		logger1.log(Status.INFO,"To clicking create Account link");
        try {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(obj.create_button));
                obj.create_button.click();
                logger1.log(Status.PASS,"Successfully clicked create account link");
            
        } catch (Exception e) {
            System.out.println("CreateButton: " + e.getMessage());
            logger1.log(Status.FAIL,"unable to click create account link");
        }
        extent.flush();
    }
//    This method for getting the error message 
    public static String getErrorMessage() {
        try {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(obj.errors));
            return obj.errors.getText();
            
        } catch (Exception e) {
            return "Error message not found.";
            
        }
    }
  //This method for getting the successfully created account message 
    public static String getSuccessMessage() {
        try {
        	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
             wait.until(ExpectedConditions.visibilityOf(obj.success));
             return obj.success.getText();
             
         } catch (Exception e) {
             return "Success message not found.";
         }
    }
}