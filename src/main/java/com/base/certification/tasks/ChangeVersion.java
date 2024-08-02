package com.base.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.base.certification.userinterfaces.HomePage.TITLE_LABEL;
import static com.base.certification.userinterfaces.HomePage.VERSION_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ChangeVersion implements Task {
    private int version;

    public ChangeVersion(int version) {
        this.version = version;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TITLE_LABEL, isVisible()).forNoMoreThan(5).seconds());
        switch (version) {
            case 2:
                actor.attemptsTo(Click.on(VERSION_BUTTON(3)));
                break;
            case 3:
                actor.attemptsTo(Click.on(VERSION_BUTTON(2)));
                break;
        }
    }

    public static ChangeVersion to(int version) {
        return Tasks.instrumented(ChangeVersion.class, version);
    }
}