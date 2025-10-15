package com.hooks;

import com.common.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass1 {

    common.BaseClass base = new common.BaseClass();

    @Before
    public void beforeScenario() {
        System.out.println("=== Launching Browser ===");
        base.browserLaunch();
    }

    @After
    public void afterScenario() {
        System.out.println("=== Closing Browser ===");
        base.closeBrowser();
    }
}
