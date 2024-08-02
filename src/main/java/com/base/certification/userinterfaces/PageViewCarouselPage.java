package com.base.certification.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class PageViewCarouselPage {
    public static final Target CAROUSEL_SLIDER_TITLE_LABEL = Target.the("título de la pagina PageView Carousel").located(AppiumBy.accessibilityId("Carousel Slider"));

    public static Target PRODUCT(int productNumber) {
        return Target.the("número de producto " + productNumber).located(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(" + (productNumber - 1) + ")"));
    }
}
