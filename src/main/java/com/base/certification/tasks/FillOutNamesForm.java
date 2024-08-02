package com.base.certification.tasks;

import com.base.certification.interactions.Tap;
import com.base.certification.model.Names;
import com.base.certification.model.Point;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.base.certification.userinterfaces.InputsScreenPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class FillOutNamesForm implements Task {
    Names names;

    public FillOutNamesForm(Names names) {
        this.names = names;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUTS_SCREEN_TITLE_LABEL, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(NAMES_INPUT),
                Enter.theValue(names.getName()).into(NAMES_INPUT),
                Tap.fromTo(Point.builder().x(358).y(519).build()),
                Click.on(LABEL_HELPER_INPUT),
                Enter.theValue(names.getDescription()).into(LABEL_HELPER_INPUT),
                Click.on(VALIDATE_1_BUTTON)
        );
    }

    public static FillOutNamesForm with(Names names) {
        return Tasks.instrumented(FillOutNamesForm.class, names);
    }
}