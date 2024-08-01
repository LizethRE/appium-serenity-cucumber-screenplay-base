package com.base.certification.stepdefinitions;

import io.cucumber.java.es.Dado;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class CommonsStepDefinitions {
    @Managed(driver = "appium")
    public static WebDriver driver;

    @Dado("que {actor} esta en la APP Material Design")
    public void queActorEstaEnLaAppMaterialDesign(Actor actor) {
        actor.can(BrowseTheWeb.with(driver).asActor(actor));
        actor.entersTheScene();
    }
}