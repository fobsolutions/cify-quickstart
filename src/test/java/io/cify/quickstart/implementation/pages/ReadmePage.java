package io.cify.quickstart.implementation.pages;

import io.cify.framework.PageObjects;
import io.cify.framework.core.Device;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by FOB Solutions
 */
public class ReadmePage extends PageObjects {

    @FindBy(id = "readme")
    private WebElement readme;

    public ReadmePage(Device device) {
        super(device);
    }

    public WebElement getReadme() {
        return readme;
    }
}
