package com.TastyNibbles.Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.TastyNibbles.Browser.Browser;
import com.TastyNibbles.Locators.Page4Objects;

public class Page4 extends Browser {
    
    public static Page4Objects obj;
   //This method for getting error message while entering Invalid credentials
    public static void getErrorMessage(String expectedErrorMessage) {
        try {
            obj = new Page4Objects();
            wait.until(ExpectedConditions.visibilityOf(obj.errorMessage));
            String actualErrorMessage = obj.errorMessage.getText(); 
            Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"Assertion Failed: Error message does not match. Expected: " + expectedErrorMessage + ", but got: " + actualErrorMessage);
        } catch (Exception e) {
            System.out.println("Error message retrieval failed: " + e.getMessage());
        }
    }
    //This method for getting success message while entering valid credentials 
    public static void getSuccessMessage(String expectedSuccessMessage) {
        try {
        	obj = new Page4Objects();
            wait.until(ExpectedConditions.visibilityOf(obj.successMessage));
            String actualSuccessMessage = obj.successMessage.getText();
            Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage,"Assertion Failed: Success message does not match. Expected: " + expectedSuccessMessage + ", but got: " + actualSuccessMessage);
        } catch (Exception e) {
            System.out.println("Success message retrieval failed: " + e.getMessage());
        }
    }
}