package com.mersey.rowing.club.e2e_testing.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",   // Path to your .feature files
        glue = {"com.mersey.rowing.club.e2e_testing.stepdefs", "com.mersey.rowing.club.e2e_testing"}, // Step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Generate reports
        monochrome = true // Cleaner console output
)

public class TestRunner {
}
