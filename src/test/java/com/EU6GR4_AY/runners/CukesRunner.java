package com.EU6GR4_AY.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"json:target/cucumber.json",
                    "html:target/default-html-reports"},
            features = "src/test/resources/features",
            glue = "com/EU6GR4_AY/stepDefinations",
            dryRun = false,
            tags = "@login"
    )
    public class CukesRunner {
    }