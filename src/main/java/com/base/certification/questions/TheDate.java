package com.base.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.base.certification.userinterfaces.DatePickerPage.DATE_VIEW;

public class TheDate implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return DATE_VIEW.resolveFor(actor).getAttribute("text");
    }


    public static TheDate is() {
        return new TheDate();
    }
}