package io.cify.quickstart.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cify.framework.core.Device;
import io.cify.framework.core.DeviceCategory;
import io.cify.framework.core.DeviceManager;
import io.cify.quickstart.implementation.actions.ReadmePageActionsWeb;

import static io.cify.framework.core.DeviceManager.getInstance;

/**
 * Created by FOB Solutions
 */
public class GitHubSteps {

    @When("^user opens Cify quickstart readme page$")
    public void userOpensCifyQuickstartReadmePage() {
        Device device = getInstance().createDevice(DeviceCategory.BROWSER);
        device.openBrowser("https://github.com/fobsolutions/cify-quickstart/blob/master/README.md");
    }

    @Then("^readme should be visible$")
    public void readmeShouldBeVisible() {
        Device device = DeviceManager.getInstance().getActiveDevice();
        ReadmePageActionsWeb matchersWeb = new ReadmePageActionsWeb(device);
        matchersWeb.shouldHaveContent();
    }

    @After
    public void close() {
        getInstance().quitAllDevices();
    }
}
