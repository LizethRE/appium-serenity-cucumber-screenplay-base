package com.base.certification.stepdefinitions;

import com.base.certification.interactions.Back;
import com.base.certification.model.Names;
import com.base.certification.model.User;
import com.base.certification.questions.TheAlert;
import com.base.certification.questions.TheErrorAlert;
import com.base.certification.tasks.FillOutNamesForm;
import com.base.certification.tasks.FillOutUserForm;
import com.base.certification.tasks.GoTo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class InputsScreenStepDefinitions {
    @Cuando("diligencia el formulario de nombre")
    public void diligenciaElFormularioDeNombre(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);
        int rowNumber = 1;

        OnStage.theActorInTheSpotlight().attemptsTo(GoTo.inputsScreen().then(FillOutNamesForm.with(Names.builder()
                        .name(items.get(rowNumber).get(0).trim())
                        .description(items.get(rowNumber).get(1))
                        .build()
                ))
        );
    }

    @Cuando("diligencia el formulario de usuario")
    public void diligenciaElFormularioDeUsuario(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);
        int rowNumber = 1;

        OnStage.theActorInTheSpotlight().attemptsTo(GoTo.inputsScreen().then(FillOutUserForm.with(User.builder()
                        .name(items.get(rowNumber).get(0).trim())
                        .phoneNumber(items.get(rowNumber).get(1).trim())
                        .password(items.get(rowNumber).get(0).trim())
                        .build()
                ))
        );
    }

    @Entonces("^deberia visualizar la alerta con el mensaje (.*)")
    public void deberiaVisualizarLaAlertaConElMensaje(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(TheAlert.isDisplayed(message)));
        OnStage.theActorInTheSpotlight().attemptsTo(Back.now());
    }

    @Entonces("^deberia visualizar la alerta de error con el mensaje (.*)")
    public void deberiaVisualizarLaAlertaDeErrorConElMensaje(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(TheErrorAlert.is(message), equalTo(message)));
        OnStage.theActorInTheSpotlight().attemptsTo(Back.now());
    }
}