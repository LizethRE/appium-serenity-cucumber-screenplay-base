package com.base.certification.interactions;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;


public class Back implements Interaction {
    @Override
    @Step("Back to the previous page")
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver appiumDriver = (AppiumDriver) ThucydidesWebDriverSupport.getProxiedDriver();

        appiumDriver.navigate().back();
    }

    public static Back now() {
        return Tasks.instrumented(Back.class);
    }
}