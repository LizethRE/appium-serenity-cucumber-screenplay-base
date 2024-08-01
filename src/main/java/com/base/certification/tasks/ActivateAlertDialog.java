package com.base.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.base.certification.userinterfaces.DialogsDemoPage.DIALOGS_DEMO_TITLE_LABEL;
import static com.base.certification.userinterfaces.DialogsDemoPage.SHOW_ALERT_DIALOG_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ActivateAlertDialog implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DIALOGS_DEMO_TITLE_LABEL, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SHOW_ALERT_DIALOG_BUTTON)
        );
    }

    public static ActivateAlertDialog now() {
        return Tasks.instrumented(ActivateAlertDialog.class);
    }
}