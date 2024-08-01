package com.base.certification.stepdefinitions;

import com.base.certification.interactions.Back;
import com.base.certification.model.AlertDialog;
import com.base.certification.questions.TheAlertDialog;
import com.base.certification.tasks.ActivateAlertDialog;
import com.base.certification.tasks.GoTo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DialogsDemoStepDefinitions {
    @Cuando("activa el dialogo de alerta")
    public void activaElDialogoDeAlerta() {
        OnStage.theActorInTheSpotlight().attemptsTo(GoTo.dialogsDemo().then(ActivateAlertDialog.now()));
    }

    @Entonces("deberia visualizar el cuadro de dialogo")
    public void deberiaVisualizarElCuadroDeDialogo(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);
        int rowNumber = 1;

        OnStage.theActorInTheSpotlight().should(seeThat(TheAlertDialog.isDisplayed(AlertDialog.builder()
                .title(items.get(rowNumber).get(0).trim())
                .description(items.get(rowNumber).get(1).trim())
                .build()
        )));
        OnStage.theActorInTheSpotlight().attemptsTo(Back.now());
        OnStage.theActorInTheSpotlight().attemptsTo(Back.now());
    }
}