package com.runner;

import org.junit.runner.RunWith;
<<<<<<< HEAD
=======

>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", glue = "com.stepdefinit", 
<<<<<<< HEAD
                  tags = "@ThirdFeature", 
=======
                 // tags = "@SmokeTest_M", 
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
                 dryRun = false, monochrome = true, plugin = {
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html",
                "junit:target/cucumber-report/Cucumber.xml"
})
<<<<<<< HEAD
public class RunnerClass {   



=======
public class RunnerClass {
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
}
