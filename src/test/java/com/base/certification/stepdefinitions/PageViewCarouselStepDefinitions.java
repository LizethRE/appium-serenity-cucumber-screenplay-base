package com.base.certification.stepdefinitions;

import com.base.certification.interactions.Back;
import com.base.certification.interactions.SwipeVertically;
import com.base.certification.questions.TheProduct;
import com.base.certification.tasks.GoTo;
import com.base.certification.tasks.SearchProduct;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PageViewCarouselStepDefinitions {
    @Cuando("busca el producto {int}")
    public void buscaElproducto(int productNumber) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoTo.pageViewCarousel(),
                SearchProduct.by(productNumber)
        );
    }

    @Entonces("deberia visualizar el producto {int}")
    public void deberiaVisualizarElProducto(int productNumber) {
        OnStage.theActorInTheSpotlight().should(seeThat(TheProduct.isDisplayed(productNumber)));
        OnStage.theActorInTheSpotlight().attemptsTo(Back.now().then(SwipeVertically.toUp()));
    }
}