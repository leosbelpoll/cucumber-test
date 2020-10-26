package com.leito.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "classpath:login/LoginTest.feature", glue = "com.leito.cucumber", plugin = {"html:target/cucumber-test-report", "junit:target/junit-xml-report.xml", "json:target/json-report.json"})
public class TestRunnerWithTestNG extends AbstractTestNGCucumberTests {

}
