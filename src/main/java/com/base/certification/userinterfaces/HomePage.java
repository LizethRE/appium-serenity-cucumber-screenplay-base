package com.base.certification.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target TITLE_LABEL = Target.the("título de la APP ").located(AppiumBy.accessibilityId("Show Case Material 2 vs 3 "));
    public static final Target APP_CONTADOR_VIEW = Target.the("card APP Contador").located(AppiumBy.accessibilityId("App Contador"));
    public static final Target DATE_PICKER_SCREEN_VIEW = Target.the("card DatePicker Screen").located(AppiumBy.accessibilityId("DatePicker screeen"));
    public static final Target DIALOGS_DEMO_VIEW = Target.the("card Dialogs Demo").located(AppiumBy.accessibilityId("Dialogs Demo"));
    public static final Target INPUTS_SCREEN_VIEW = Target.the("card Inputs Screen").located(AppiumBy.accessibilityId("Inputs Screen "));
    public static final Target CAROUSEL_VIEW = Target.the("card Carousel").located(AppiumBy.accessibilityId("PageView Carousel"));

    public static Target VERSION_BUTTON(int version) {
        return Target.the("botón v" + version).located(AppiumBy.accessibilityId("v" + version));
    }
}
