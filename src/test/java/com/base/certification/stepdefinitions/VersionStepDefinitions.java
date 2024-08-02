package com.base.certification.stepdefinitions;

import com.base.certification.questions.TheVersion;
import com.base.certification.tasks.ChangeVersion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class VersionStepDefinitions {
    @Cuando("cambia a la version {int}")
    public void cambiaALaVersion(int version) {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeVersion.to(version));
    }

    @Entonces("deberia visualizar la version {int}")
    public void deberiaVisualizarLaVersion(int version) {
        OnStage.theActorInTheSpotlight().should(seeThat(TheVersion.is(version), equalTo("v" + version)));
    }
}