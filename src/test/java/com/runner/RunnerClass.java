package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", glue = "com.stepdefinit", 
                  tags = "@ThirdFeature", 
                 dryRun = false, monochrome = true, plugin = {
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html",
                "junit:target/cucumber-report/Cucumber.xml"
})
public class RunnerClass {   



}
