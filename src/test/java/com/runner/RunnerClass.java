package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature/API_React_APP.feature", 
    glue = "com.stepdefinit", 
    dryRun = false,
    monochrome = true,
    plugin = { 
        "json:target/cucumber-report/cucumber.json", 
        "html:target/cucumber-report/cucumber.html"
    }
)
public class RunnerClass {
}
