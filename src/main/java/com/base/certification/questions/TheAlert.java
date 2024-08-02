package com.base.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.base.certification.userinterfaces.CommonPage.ALERT_LABEL;

public class TheAlert implements Question<Boolean> {
    String message;

    public TheAlert(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ALERT_LABEL(message).resolveFor(actor).isDisplayed();
    }


    public static TheAlert isDisplayed(String message) {
        return new TheAlert(message);
    }
}