package com.base.certification.tasks;

import com.base.certification.interactions.SwipeHorizontally;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.base.certification.userinterfaces.PageViewCarouselPage.CAROUSEL_SLIDER_TITLE_LABEL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SearchProduct implements Task {
    private int productNumber;

    public SearchProduct(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(CAROUSEL_SLIDER_TITLE_LABEL, isVisible()).forNoMoreThan(5).seconds());
        if (productNumber > 1) {
            for (int i = 1; i < productNumber; i++) {
                actor.attemptsTo(SwipeHorizontally.toTheLeft());
            }
        }
    }

    public static SearchProduct by(int productNumber) {
        return Tasks.instrumented(SearchProduct.class, productNumber);
    }
}