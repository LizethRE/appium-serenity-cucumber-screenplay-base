package com.base.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.base.certification.userinterfaces.CommonPage.ALERT_LABEL;

public class TheErrorAlert implements Question<String> {
    String message;

    public TheErrorAlert(String message) {
        this.message = message;
    }

    @Override
    public String answeredBy(Actor actor) {
        return ALERT_LABEL(message).resolveFor(actor).getAttribute("content-desc");
    }


    public static TheErrorAlert is(String message) {
        return new TheErrorAlert(message);
    }
}