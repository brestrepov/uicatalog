package com.uicatalog.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.uicatalog.userinterfaces.AlertPage.BTN_SIMPLE_ALERT;
import static com.uicatalog.userinterfaces.MenuPage.BTN_ALERT_VIEW;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterAlert implements Task {

    @Override
    @Step("{0} enter simple alert option")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ALERT_VIEW, isVisible()),
                Click.on(BTN_ALERT_VIEW),
                Click.on(BTN_SIMPLE_ALERT)
        );
    }

    public static Performable option() {
        return Tasks.instrumented(EnterAlert.class);
    }
}
