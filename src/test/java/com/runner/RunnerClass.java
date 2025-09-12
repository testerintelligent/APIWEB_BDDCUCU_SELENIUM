package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature/API_Yugi_DemoTest.feature", 
    glue = "com.stepdefinit", 
   // tags = "@Smoke2",
    dryRun = false,
    monochrome = true,
    plugin = { 
        "json:target/cucumber-report/cucumber.json", 
        "html:target/cucumber-report/cucumber.html",
        "junit:target/cucumber-report/Cucumber.xml"
    }
)
public class RunnerClass {
}
