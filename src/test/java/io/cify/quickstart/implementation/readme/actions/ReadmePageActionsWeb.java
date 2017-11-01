package io.cify.quickstart.implementation.readme.actions;

import io.cify.framework.core.Device;
import io.cify.quickstart.implementation.readme.pages.ReadmePage;

import static org.junit.Assert.assertFalse;

/**
 * Created by FOB Solutions
 */
public class ReadmePageActionsWeb implements IReadmePageActions {

    private ReadmePage page;

    public ReadmePageActionsWeb(Device device) {
        page = new ReadmePage(device);
    }

    /**
     * Checks if readme have some content
     */
    @Override
    public void shouldHaveContent() {
        assertFalse(page.getReadme().getText().isEmpty());
    }
}
