package com.base.certification.questions;

import com.base.certification.model.AlertDialog;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.base.certification.userinterfaces.CommonPage.ALERT_LABEL;

public class TheAlertDialog implements Question<Boolean> {
    AlertDialog alertDialog;

    public TheAlertDialog(AlertDialog alertDialog) {
        this.alertDialog = alertDialog;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ALERT_LABEL(alertDialog.getTitle()).resolveFor(actor).isDisplayed() && ALERT_LABEL(alertDialog.getDescription()).resolveFor(actor).isDisplayed();
    }


    public static TheAlertDialog isDisplayed(AlertDialog alertDialog) {
        return new TheAlertDialog(alertDialog);
    }
}