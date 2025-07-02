
package com.stepdefinit;

import com.example.Demo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepDefi {
    Demo demo;
    int result;

    @When("I add {int} and {int}")
    public void i_add(int a, int b) {
        demo = new Demo();
        result = demo.add(a, b);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expected) {
        assertEquals(expected, result);
    }
}
