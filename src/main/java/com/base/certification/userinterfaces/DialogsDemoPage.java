package com.base.certification.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class DialogsDemoPage {
    public static final Target DIALOGS_DEMO_TITLE_LABEL = Target.the("título de la pagina Dialogs Demo").located(AppiumBy.accessibilityId("AlertDialog Widget"));
    public static final Target SHOW_ALERT_DIALOG_BUTTON = Target.the("botón Show AlertDialog Widget").located(AppiumBy.accessibilityId("Show AlertDialog Widget"));
}
