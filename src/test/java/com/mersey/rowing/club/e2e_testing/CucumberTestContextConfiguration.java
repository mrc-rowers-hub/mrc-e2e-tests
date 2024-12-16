package com.mersey.rowing.club.e2e_testing;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


import org.springframework.test.context.junit4.SpringRunner;

@CucumberContextConfiguration
@RunWith(SpringRunner.class)
@CucumberOptions(
features = "src/test/resources/features",   // Path to your .feature files
glue = {"com.mersey.rowing.club.e2e_testing.stepdefs"}, // Step definitions
plugin = {"pretty", "html:target/cucumber-reports.html"}, // Generate reports
monochrome = true )// Cleaner console output)
public class CucumberTestContextConfiguration {


}