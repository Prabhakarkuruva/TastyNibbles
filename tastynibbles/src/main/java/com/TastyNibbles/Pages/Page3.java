package com.TastyNibbles.Pages;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import com.TastyNibbles.Browser.Browser;
import com.TastyNibbles.Locators.Page3Objects;

public class Page3 extends Browser {
    static Page3Objects obj;
  //This method for clicking the logout
    public static void logOut() {
        try {
            obj = new Page3Objects();
            driver.get(driver.getCurrentUrl());
            wait.until(ExpectedConditions.visibilityOf(obj.logout));
            obj.logout.click();
            verifyUserRedirectedToHomePage();
        } catch (Exception e) {
            System.out.println("Logout failed: " + e.getMessage());
        }
    }
  //This method is used to verify the account is successfully logout or not
    public static void verifyUserRedirectedToHomePage() {
        try {
            wait.until(ExpectedConditions.urlToBe("https://www.tastynibbles.in/"));
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.equals("https://www.tastynibbles.in/"),"Assertion Failed: User is not redirected to the homepage after logout. Current URL: " + currentUrl);
        } catch (Exception e) {
            System.out.println("Redirection failed: " + e.getMessage());
        }
    }



}