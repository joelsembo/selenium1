package com.newtech.Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunnerNG {

	@CucumberOptions(
			features= {"Features"} ,
			glue = {"com.newtech.Stepdefs"} 
			//tags = {"@userLogIn"}
			)
	public class Testrunner extends AbstractTestNGCucumberTests {}
}
