package com.base.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.base.certification.userinterfaces.PageViewCarouselPage.PRODUCT;

public class TheProduct implements Question<Boolean> {
    private int productNumber;

    public TheProduct(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (productNumber > 3) {
            return PRODUCT(2).resolveFor(actor).isDisplayed();
        } else {
            return PRODUCT(productNumber).resolveFor(actor).isDisplayed();
        }
    }

    public static TheProduct isDisplayed(int productNumber) {
        return new TheProduct(productNumber);
    }
}