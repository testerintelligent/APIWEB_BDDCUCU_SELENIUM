package com.hooks;

import com.resources.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

    BaseClass base = new BaseClass();

    @Before
    public void beforeScenario() {
        System.out.println("=== Launching Browser ===");
        base.LaunchBrowser();
    }

    @After
    public void afterScenario() {
        System.out.println("=== Closing Browser ===");
        base.closeBrowser();
    }
}
