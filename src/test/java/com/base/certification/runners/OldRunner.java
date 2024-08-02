package com.base.certification.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "com.base.certification.stepdefinitions",
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class OldRunner {
}