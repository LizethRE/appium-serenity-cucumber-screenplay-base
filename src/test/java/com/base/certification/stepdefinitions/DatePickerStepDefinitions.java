package com.base.certification.stepdefinitions;

import com.base.certification.interactions.Back;
import com.base.certification.model.Date;
import com.base.certification.model.Hour;
import com.base.certification.questions.TheDate;
import com.base.certification.questions.TheHour;
import com.base.certification.tasks.GoTo;
import com.base.certification.tasks.UpdateDateAndTimePicker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class DatePickerStepDefinitions {
    @Cuando("actualiza la fecha {int}-{int}-{int} y hora {int}:{int}")
    public void actualizaLaFechaYHora(int year, int month, int day, int hour, int minute) {
        OnStage.theActorInTheSpotlight().attemptsTo(GoTo.datePickerScreen().then(UpdateDateAndTimePicker.to(
                Date.builder().day(day).month(month).year(year).build(),
                Hour.builder().hour(hour).minute(minute).build()
        )));
    }

    @Entonces("deberia visualizar los datos actualizados {int}-{int}-{int} y {int}:{int}")
    public void deberiaVisualizarLosDatosActualizados(int year, int month, int day, int hour, int minute) {
        String tmpMonth = String.format("%02d", month);
        String tmpDay = String.format("%02d", day);
        String tmpHour = String.format("%02d", hour);
        String tmpMinute = String.format("%02d", minute);

        OnStage.theActorInTheSpotlight().should(seeThat(TheDate.is(), equalTo(year + "-" + tmpMonth + "-" + tmpDay)));
        OnStage.theActorInTheSpotlight().should(seeThat(TheHour.is(), equalTo("TimeOfDay(" + tmpHour + ":" + tmpMinute + ")")));
        OnStage.theActorInTheSpotlight().attemptsTo(Back.now());
    }
}