package com.uicatalog.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/action.feature",
        glue = "com.uicatalog.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ActionRunner {
}
