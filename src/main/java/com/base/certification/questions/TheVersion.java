package com.base.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.base.certification.userinterfaces.HomePage.VERSION_BUTTON;

public class TheVersion implements Question<String> {
    private int version;

    public TheVersion(int version) {
        this.version = version;
    }

    @Override
    public String answeredBy(Actor actor) {
        return VERSION_BUTTON(version).resolveFor(actor).getAttribute("content-desc");
    }


    public static TheVersion is(int version) {
        return new TheVersion(version);
    }
}