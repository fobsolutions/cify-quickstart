package io.cify.quickstart.implementation.matchers;

import io.cify.framework.core.Device;
import io.cify.quickstart.implementation.pages.ReadmePage;

import static org.junit.Assert.assertFalse;

/**
 * Created by FOB Solutions
 */
public class ReadmePageMatchersWeb implements ReadmePageMatchers {

    private ReadmePage page;

    public ReadmePageMatchersWeb(Device device) {
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
