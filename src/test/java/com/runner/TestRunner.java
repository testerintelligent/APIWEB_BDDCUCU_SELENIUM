package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
<<<<<<< HEAD:src/test/java/com/runner/TestRunner.java
@CucumberOptions(features = "src/test/resources/Feature", glue = "com.stepdefinit", 
                  tags = "@FeaturesOne", 
                 dryRun = false, monochrome = true, plugin = {
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html",
                "junit:target/cucumber-report/Cucumber.xml"
})
public class TestRunner {   


=======
@CucumberOptions(features = "src/test/resources/Feature", glue = "com.stepdefinit", tags = "@test1", dryRun = false, monochrome = true, plugin = {
        "json:target/cucumber-report/cucumber.json",
        "html:target/cucumber-report/cucumber.html",
        "junit:target/cucumber-report/Cucumber.xml"
})
public class RunnerClass {
>>>>>>> 9f1b73e9f92dbe3e25837d75cf72eae40471203a:src/test/java/com/runner/RunnerClass.java

}
