package io.cify.quickstart.implementation.actions;

import io.cify.framework.core.Device;
import io.cify.quickstart.implementation.pages.ReadmePage;

/**
 * Created by FOB Solutions
 */
public class ReadmePageActionsWeb implements ReadmePageActions {

    private ReadmePage page;

    public ReadmePageActionsWeb(Device device) {
        page = new ReadmePage(device);
    }

    /**
     * Clicks on a repository author link
     */
    @Override
    public void clickOnRepositoryAuthor() {
        page.getAuthor().click();
    }
}
