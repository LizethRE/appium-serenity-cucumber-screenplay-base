package com.base.certification.tasks;

import com.base.certification.model.Date;
import com.base.certification.model.Hour;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.base.certification.userinterfaces.CommonPage.OK_BUTTON;
import static com.base.certification.userinterfaces.DatePickerPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class UpdateDateAndTimePicker implements Task {
    private Date date;
    private Hour hour;

    public UpdateDateAndTimePicker(Date date, Hour hour) {
        this.date = date;
        this.hour = hour;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(DATE_PICKER_TITLE_LABEL, isVisible()).forNoMoreThan(5).seconds());
        actor.attemptsTo(
                Click.on(DATE_VIEW),
                Click.on(DATE_EDIT_BUTTON),
                Enter.theValue(date.getMonth() + "/" + date.getDay() + "/" + date.getYear()).into(DATE_INPUT),
                Click.on(OK_BUTTON)
        );
        actor.attemptsTo(
                Click.on(HOUR_VIEW),
                Click.on(KEYBOARD_MODE_BUTTON),
                Click.on(HOUR_INPUT),
                Enter.theValue(hour.getHour() + "").into(HOUR_INPUT),
                Click.on(MINUTE_INPUT),
                Enter.theValue(hour.getMinute() + "").into(MINUTE_INPUT)
        );
        if (hour.getHour() < 12) {
            actor.attemptsTo(Click.on(HOUR_INDICATOR("AM")));
        }
        actor.attemptsTo(Click.on(OK_BUTTON));
    }

    public static UpdateDateAndTimePicker to(Date date, Hour hour) {
        return Tasks.instrumented(UpdateDateAndTimePicker.class, date, hour);
    }
}