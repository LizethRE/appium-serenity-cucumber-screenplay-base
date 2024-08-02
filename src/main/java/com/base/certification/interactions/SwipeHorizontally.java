package com.base.certification.interactions;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Arrays;


public class SwipeHorizontally {
    public static Performable toTheLeft() {
        return Task.where("Swipe horizontally to the left", actor -> {
            AppiumDriver appiumDriver = (AppiumDriver) ThucydidesWebDriverSupport.getProxiedDriver();
            Dimension dimension = appiumDriver.manage().window().getSize();

            int startX = (int) (dimension.getWidth() * 0.8);
            int startY = (dimension.getHeight() / 2);
            int endX = (int) (dimension.getWidth() * 0.2);

            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            Sequence swipe = new Sequence(finger, 1);
            swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX, startY));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            appiumDriver.perform(Arrays.asList(swipe));
        });
    }

    public static Performable toTheRight() {
        return Task.where("Swipe horizontally to the right", actor -> {
            AppiumDriver appiumDriver = (AppiumDriver) ThucydidesWebDriverSupport.getProxiedDriver();
            Dimension dimension = appiumDriver.manage().window().getSize();

            int startX = (int) (dimension.getWidth() * 0.2);
            int startY = (dimension.getHeight() / 2);
            int endX = (int) (dimension.getWidth() * 0.8);

            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            Sequence swipe = new Sequence(finger, 1);
            swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX, startY));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            appiumDriver.perform(Arrays.asList(swipe));
        });
    }
}