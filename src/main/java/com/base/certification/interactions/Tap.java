package com.base.certification.interactions;

import com.base.certification.model.Point;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Arrays;


public class Tap implements Interaction {
    private Point point;

    public Tap(Point point) {
        this.point = point;
    }

    @Override
    @Step("Tap")
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver appiumDriver = (AppiumDriver) ThucydidesWebDriverSupport.getProxiedDriver();

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), point.getX(), point.getY()));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        appiumDriver.perform(Arrays.asList(tap));
    }

    public static Tap fromTo(Point point) {
        return Tasks.instrumented(Tap.class, point);
    }
}