package com.base.certification.tasks;

import com.base.certification.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.base.certification.userinterfaces.InputsScreenPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class FillOutUserForm implements Task {
    User user;

    public FillOutUserForm(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUTS_SCREEN_TITLE_LABEL, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(NAME_INPUT),
                Enter.theValue(user.getName()).into(NAME_INPUT),
                Click.on(PHONE_NUMBER_INPUT),
                Enter.theValue(user.getPhoneNumber()).into(PHONE_NUMBER_INPUT),
                Click.on(PASSWORD_INPUT),
                Enter.theValue(user.getPassword()).into(PASSWORD_INPUT),
                Click.on(VALIDATE_2_BUTTON)
        );
    }

    public static FillOutUserForm with(User user) {
        return Tasks.instrumented(FillOutUserForm.class, user);
    }
}