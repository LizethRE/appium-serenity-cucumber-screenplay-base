package com.base.certification.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CommonPage {
    public static final Target OK_BUTTON = Target.the("botón OK").located(AppiumBy.accessibilityId("OK"));
    public static final Target CANCEL_BUTTON = Target.the("botón CANCEL").located(AppiumBy.accessibilityId("CANCEL"));

    public static Target ALERT_LABEL(String message) {
        return Target.the("alerta con el mensaje: " + message).located(AppiumBy.accessibilityId(message));
    }
}
