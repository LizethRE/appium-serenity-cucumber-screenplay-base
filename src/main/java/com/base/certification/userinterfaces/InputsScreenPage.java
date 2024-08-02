package com.base.certification.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class InputsScreenPage {
    public static final Target INPUTS_SCREEN_TITLE_LABEL = Target.the("título de la pagina Dialogs Demo").located(AppiumBy.accessibilityId("TextField Widget"));
    public static final Target NAMES_INPUT = Target.the("campo Names (autocomplete)").located(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
    public static final Target LABEL_HELPER_INPUT = Target.the("campo label helper").located(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
    public static final Target VALIDATE_1_BUTTON = Target.the("botón Validar 1").located(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"validar\"])[1]"));
    public static final Target NAME_INPUT = Target.the("campo Nombre").located(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[3]"));
    public static final Target PHONE_NUMBER_INPUT = Target.the("campo Celular").located(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[4]"));
    public static final Target PASSWORD_INPUT = Target.the("campo Contrasenia").located(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[5]"));
    public static final Target VALIDATE_2_BUTTON = Target.the("botón Validar 2").located(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"validar\"])[2]"));
}
