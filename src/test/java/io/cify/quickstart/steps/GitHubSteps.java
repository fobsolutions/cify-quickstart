package io.cify.quickstart.steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cify.framework.core.DeviceManager;

/**
 * Created by FOB Solutions
 */
public class GitHubSteps {

    @After
    public void close() {
        DeviceManager.quitDevices();
    }

    @When("^user opens Cify quickstart readme page$")
    public void userOpensCifyQuickstartReadmePage() {
        DeviceManager.createDevice().openBrowser("https://github.com/fobsolutions/cify-quickstart/blob/master/README.md");
    }

    @Then("^readme should be visible$")
    public void readmeShouldBeVisible() {

    }
}
