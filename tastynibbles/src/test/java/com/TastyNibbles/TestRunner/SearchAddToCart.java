package com.TastyNibbles.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
@CucumberOptions(features="src\\test\\resources\\com.tastynibbles.Feature\\SearchAnd.feature",
glue= {"com.TastyNibbles.stepDefinition"},
plugin= {"pretty","html:target/CucumberReport/SearchAndToCart.html"},
monochrome=true)

public class SearchAddToCart extends AbstractTestNGCucumberTests {

}