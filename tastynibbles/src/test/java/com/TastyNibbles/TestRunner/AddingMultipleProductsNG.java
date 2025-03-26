package com.TastyNibbles.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
@CucumberOptions(features="src\\test\\resources\\com.tastynibbles.Feature\\AddingMultipleProductsToCart.feature",
glue= {"com.TastyNibbles.stepDefinition"},
plugin= {"pretty","html:target/CucumberReport/MultipleCart.html"},
monochrome=true)


public class AddingMultipleProductsNG extends AbstractTestNGCucumberTests {

}