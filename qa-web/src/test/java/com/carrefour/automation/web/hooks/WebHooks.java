package com.carrefour.automation.web.hooks;

import com.carrefour.automation.core.driver.DriverFactory;
import com.carrefour.automation.core.utils.EvidenceManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class WebHooks {

    @Before
    public void setup() {
        DriverFactory.getDriver();
    }

    @AfterStep
    public void captureEvidence(Scenario scenario) {
        EvidenceManager.takeScreenshot(DriverFactory.getDriver(), scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            EvidenceManager.takeScreenshot(DriverFactory.getDriver(), scenario.getName() + "_FAILED");
        }
        DriverFactory.quitDriver();
    }
}
