package com.base.certification.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class DatePickerPage {
    public static final Target DATE_PICKER_TITLE_LABEL = Target.the("título de la pagina Date Picker").located(AppiumBy.accessibilityId("Date Picker"));
    public static final Target DATE_VIEW = Target.the("campo Selector de Fecha").located(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(7)"));
    public static final Target DATE_EDIT_BUTTON = Target.the("botón Editar").located(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)"));
    public static final Target DATE_INPUT = Target.the("campo Fecha").located(AppiumBy.className("android.widget.EditText"));
    public static final Target HOUR_VIEW = Target.the("campo Selector de Hora").located(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(8)"));
    public static final Target KEYBOARD_MODE_BUTTON = Target.the("botón activar modo teclado").located(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)"));
    public static final Target HOUR_INPUT = Target.the("campo Hora").located(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)"));
    public static final Target MINUTE_INPUT = Target.the("campo Minutos").located(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)"));

    public static Target HOUR_INDICATOR(String value) {
        return Target.the("indicador " + value).located(AppiumBy.accessibilityId(value));
    }
}
