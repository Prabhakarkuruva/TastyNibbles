package com.TastyNibbles.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions act;
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentTest logger1;
	
	public static void init(String reportName) {
		extent=new ExtentReports();
		reporter=new ExtentSparkReporter(System.getProperty("user.dir") + "//target//ExtentReports//"+reportName+".html");
	}
	 //Open the browser based on the choice
	public static void openBrowser() throws Exception {
		init("Extent Reports of TastyNibbles");
		extent.attachReporter(reporter);
		logger1=extent.createTest("Opening the browser");
		logger1.log(Status.INFO,"Opening the Browser");
		try {
			String choice = Utility.properties("browser"); 
			if (choice.equalsIgnoreCase("Chrome"))
				driver = new ChromeDriver();
			else if (choice.equalsIgnoreCase("Edge"))
				driver = new EdgeDriver();
			else if (choice.equalsIgnoreCase("Firefox"))
				driver = new FirefoxDriver();
			logger1.log(Status.PASS,"Browser Opened Successfully");
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Browser - openBrowser");
			logger1.log(Status.FAIL,"Browser Opening is unsuccessfull");
		}
	
		extent.flush();
	}
 
	
	//Pauses the URL of the application
	public static void navigateToUrl( String url) throws Exception {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Navigating To Url");
		logger1.log(Status.INFO,"Navigating To Url");
		try {
			driver.manage().window().maximize();
			driver.get(url); 
			act = new Actions(driver);
			logger1.log(Status.PASS,"Navigated Successfully");
		} catch (Exception e) {
			System.out.println("Browser - geturl");
			logger1.log(Status.FAIL,"Navigating To Url is unsuccessfull");

		}
		extent.flush();

	}
	//This method is used for closing the browser
	public static void closeBrowser() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Closing The Browser");
		logger1.log(Status.INFO,"Closing The Browser");
		try {
			driver.quit();
			logger1.log(Status.PASS,"Browser Closed Successfully");

		} catch (Exception e) {
			System.out.println("Browser - closeBrowser");
			logger1.log(Status.FAIL,"Closing the Browser is unsuccessfull");
		}
		extent.flush();


	}
}














































































//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//init("Extent Reports of TastyNibbles");
//public class Browser {
//	public static WebDriver driver;
//	public static WebElement element;
//	public static WebDriverWait wait;
//	public static Actions act;
//	public static ExtentReports extent;
//	public static ExtentSparkReporter reporter;
//	public static ExtentTest Logger1;
//	public static void init(String reportName) {
//		extent=new ExtentReports();
//		reporter=new ExtentSparkReporter
//		(System.getProperty("user.dir")+"//target//ExtentReport//"+reportName+".html");
//		}
//	public static void openBrowser()  {
//		extent.attachReporter(reporter);
//		Logger1=extent.createTest("Open Browser");
//		Logger1.log(Status.INFO,"Opening the Browser");
//		try {
//			String choice = Utility.properties("browser"); 
//			if (choice.equalsIgnoreCase("Chrome"))
//				driver = new ChromeDriver();
//			else if (choice.equalsIgnoreCase("Edge"))
//				driver = new EdgeDriver();
//			Logger1.log(Status.PASS, "Browser Opened Successfully");
//		} catch (Exception e) {
//			// e.printStackTrace();
//			System.out.println("Browser - openBrowser "+e);
//			Logger1.log(Status.FAIL, "FAILED Opening Successfully");
//		}
//		extent.flush();
//	}
//	public static void navigateToUrl(String str) {
//		extent.attachReporter(reporter);
//		Logger1=extent.createTest("Navigate URL");
//		Logger1.log(Status.INFO,"Navigating to URL");
//		try {
//			String Url = Utility.properties("url");
//			driver.get(str); 
//			driver.manage().window().maximize();
//			Logger1.log(Status.PASS, "Navigated to URL successfully");
//		} catch (Exception e) {
//			System.out.println("Browser - navigatetoUrl "+e);
//			Logger1.log(Status.FAIL, "Unable to navigate and get title");
//		}
//		extent.flush();
//	}
//	public static void closeBrowser() {
//		extent.attachReporter(reporter);
//		Logger1=extent.createTest("Quit Browser");
//		Logger1.log(Status.INFO,"Closing the Browser");
//		try {
//			driver.quit();
//			Logger1.log(Status.PASS, "Browser closed sucessfully");
//		} catch (Exception e) {
//			System.out.println("Browser - closeBrowser "+e);
//			Logger1.log(Status.FAIL, "Unable to close the browser");
//		}
//		extent.flush();
//	}
//	
//}
