package com.TastyNibbles.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.tastynibbles.Feature\\MyAccountChecking.feature",
glue= {"com.TastyNibbles.stepDefinition"},
plugin= {"pretty","html:target/CucumberReport/MyAccount.html"},
monochrome=true)

public class MyAccountNG extends AbstractTestNGCucumberTests {


}
