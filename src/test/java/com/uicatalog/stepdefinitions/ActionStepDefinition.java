package com.uicatalog.stepdefinitions;

import com.uicatalog.tasks.EnterAlert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.uicatalog.userinterfaces.AlertPage.BTN_OK_SIMPLE_ALERT;
import static com.uicatalog.userinterfaces.AlertPage.LBL_SIMPLE_ALERT;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ActionStepDefinition {

    @When("the {string} enter the alert option")
    public void enterTheAlertOption(String user) {
        theActorCalled(user).attemptsTo(
                EnterAlert.option()
        );
    }

    @Then("He should see the diferents alerts option")
    public void heShouldSeeTheDiferentsAlertsOption() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LBL_SIMPLE_ALERT).isDisplayed(),
                Click.on(BTN_OK_SIMPLE_ALERT)
        );
    }
}
