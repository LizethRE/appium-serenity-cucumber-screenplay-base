package com.base.certification.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class AppContadorPage {
    public static final Target APP_CONTADOR_TITLE_LABEL = Target.the("título de la pagina APP Contador").located(AppiumBy.accessibilityId("App Contador Flutter"));
    public static final Target APP_CONTADOR_PLUS_BUTTON = Target.the("botón +").located(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]"));

    public static Target APP_CONTADOR_NUMBER_LABEL(int number) {
        return Target.the("número de pulsaciones: " + number).located(AppiumBy.accessibilityId("" + number));
    }
}
