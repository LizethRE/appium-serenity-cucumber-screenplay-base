package com.base.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.base.certification.userinterfaces.AppContadorPage.APP_CONTADOR_PLUS_BUTTON;
import static com.base.certification.userinterfaces.AppContadorPage.APP_CONTADOR_TITLE_LABEL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class IncreaseCounter implements Task {
    private int number;

    public IncreaseCounter(int number) {
        this.number = number;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(APP_CONTADOR_TITLE_LABEL, isVisible()).forNoMoreThan(5).seconds());
        for (int i = 1; i <= number; i++) {
            actor.attemptsTo(Click.on(APP_CONTADOR_PLUS_BUTTON));
        }
    }

    public static IncreaseCounter to(int number) {
        return Tasks.instrumented(IncreaseCounter.class, number);
    }
}