package io.cify.quickstart.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cify.framework.core.Device;
import io.cify.framework.core.DeviceCategory;
import io.cify.framework.core.DeviceManager;
import io.cify.quickstart.implementation.ActionsImpl;
import io.cify.quickstart.implementation.readme.actions.ReadmePageActionsWeb;

import static io.cify.framework.core.DeviceManager.getInstance;

/**
 * Created by FOB Solutions
 */
public class GitHubSteps {

    @When("^user opens Cify quickstart readme page$")
    public void userOpensCifyQuickstartReadmePage() {
        String deviceName = (String) DeviceManager.getInstance().getCapabilities().toDesiredCapabilities(DeviceCategory.BROWSER).getCapability("deviceName");
        Device device = getInstance().createDevice(DeviceCategory.BROWSER, deviceName);
        device.openBrowser("https://github.com/fobsolutions/cify-quickstart/blob/master/README.md");
    }

    @Then("^readme should be visible$")
    public void readmeShouldBeVisible() {
        ActionsImpl.getReadmeActions().shouldHaveContent();
    }

    @After
    public void close() {
        getInstance().quitAllDevices();
    }
}
