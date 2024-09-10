package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature", glue = "com.stepdefinit", dryRun = false,
plugin = { "json:target/cucumber-report/cucumber.json", "html:target/cucumber-report/cucumber.html",
				"json:target/cucumber-report/cucumber.xml" })
public class RunnerClass {

}
