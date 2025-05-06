package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
<<<<<<< HEAD
    features = "src/test/resources/Feature", 
    glue = "com.stepdefinit", 
=======
    features = "src/test/resources/Feature/Rajasekar_05May_2025_API.feature", 
    glue = "com.stepdefinit",
>>>>>>> 39216a0 (Fake store check)
    dryRun = false, // Set to true for dry run
    plugin = { 
        "json:target/cucumber-report/cucumber.json", 
        "html:target/cucumber-report/cucumber.html"
    }
)
public class RunnerClass {
}