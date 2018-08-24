package com.cg.RaviCucumberOptions.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"json:Folder_Name/cucumber.json",},
		features= {"features"},  
		glue= {"com.cg.RaviCucumberOptions.step"} ,
		dryRun=false,strict=true,monochrome=false,
		tags= "@sanity,@regression"
		
		)
public class TestRunner {

}
