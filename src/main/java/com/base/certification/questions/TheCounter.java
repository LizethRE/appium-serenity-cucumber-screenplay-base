package com.base.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.base.certification.userinterfaces.AppContadorPage.APP_CONTADOR_NUMBER_LABEL;

public class TheCounter implements Question<String> {
    private int number;

    public TheCounter(int number) {
        this.number = number;
    }

    @Override
    public String answeredBy(Actor actor) {
        return APP_CONTADOR_NUMBER_LABEL(number).resolveFor(actor).getAttribute("content-desc");
    }


    public static TheCounter is(int number) {
        return new TheCounter(number);
    }
}