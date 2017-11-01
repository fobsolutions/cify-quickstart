package io.cify.quickstart.implementation;

import io.cify.framework.Actions;
import io.cify.framework.core.Device;
import io.cify.framework.core.DeviceManager;
import io.cify.quickstart.implementation.readme.actions.IReadmePageActions;

/**
 * Created by FOB Solutions
 */
public class ActionsImpl {

    /**
     * Package for implentation layer
     */
    private static final String IMPLEMENTATION_PACKAGE = "io.cify.quickstart.implementation.";


    /**
     * Gets readme actions class for active device
     *
     * @return IReadmeActions instance
     */
    public static IReadmePageActions getReadmeActions() {
        Device currentDevice = DeviceManager.getInstance().getActiveDevice();
        return (IReadmePageActions) Actions.getCustomActions(currentDevice, IMPLEMENTATION_PACKAGE + "readme.actions.ReadmePageActions");
    }

}
