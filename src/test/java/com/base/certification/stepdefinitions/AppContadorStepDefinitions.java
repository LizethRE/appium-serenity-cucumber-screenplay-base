package com.base.certification.stepdefinitions;

import com.base.certification.interactions.Back;
import com.base.certification.questions.TheCounter;
import com.base.certification.tasks.GoTo;
import com.base.certification.tasks.IncreaseCounter;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AppContadorStepDefinitions {
    @Cuando("aumenta el contador a {int}")
    public void aumentaElContadorA(int number) {
        OnStage.theActorInTheSpotlight().attemptsTo(GoTo.appContador().then(IncreaseCounter.to(number)));
    }

    @Entonces("deberia visualizar la cantidad de pulsaciones realizadas en {int}")
    public void deberiaVisualizarLaCantidadDePulsacionesRealizadasEn(int number) {
        OnStage.theActorInTheSpotlight().should(seeThat(TheCounter.is(number).asInteger(), equalTo(number)));
        OnStage.theActorInTheSpotlight().attemptsTo(Back.now());
    }
}