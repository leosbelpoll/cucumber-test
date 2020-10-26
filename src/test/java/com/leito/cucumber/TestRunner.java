package com.leito.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:login/LoginTest.feature", glue = "com.leito.cucumber", plugin = {"html:target/cucumber-test-report", "junit:target/junit-xml-report.xml", "json:target/json-report.json"})
public class TestRunner {

}
