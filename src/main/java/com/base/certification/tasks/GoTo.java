package com.base.certification.tasks;

import com.base.certification.interactions.SwipeVertically;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.base.certification.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoTo {
    public static Performable appContador() {
        return Task.where("Click on App Contador card", actor -> {
            actor.attemptsTo(
                    WaitUntil.the(TITLE_LABEL, isVisible()).forNoMoreThan(5).seconds(),
                    Click.on(APP_CONTADOR_VIEW)
            );
        });
    }

    public static Performable datePickerScreen() {
        return Task.where("Click on DatePicker screen card", actor -> {
            actor.attemptsTo(
                    WaitUntil.the(TITLE_LABEL, isVisible()).forNoMoreThan(5).seconds(),
                    Click.on(DATE_PICKER_SCREEN_VIEW)
            );
        });
    }

    public static Performable dialogsDemo() {
        return Task.where("Click on Dialogs Demo card", actor -> {
            actor.attemptsTo(
                    WaitUntil.the(TITLE_LABEL, isVisible()).forNoMoreThan(5).seconds(),
                    Click.on(DIALOGS_DEMO_VIEW)
            );
        });
    }

    public static Performable inputsScreen() {
        return Task.where("Click on Inputs Screen card", actor -> {
            actor.attemptsTo(
                    WaitUntil.the(TITLE_LABEL, isVisible()).forNoMoreThan(5).seconds(),
                    Click.on(INPUTS_SCREEN_VIEW)
            );
        });
    }

    public static Performable pageViewCarousel() {
        return Task.where("Click on PageView Carousel card", actor -> {
            actor.attemptsTo(
                    WaitUntil.the(TITLE_LABEL, isVisible()).forNoMoreThan(5).seconds(),
                    SwipeVertically.toDown(),
                    Click.on(CAROUSEL_VIEW)
            );
        });
    }
}
