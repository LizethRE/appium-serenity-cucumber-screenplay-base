package com.base.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.base.certification.userinterfaces.DatePickerPage.HOUR_VIEW;

public class TheHour implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return HOUR_VIEW.resolveFor(actor).getAttribute("text");
    }


    public static TheHour is() {
        return new TheHour();
    }
}