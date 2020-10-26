package com.leito.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:login/LoginTest.feature", glue = "com.leito.cucumber")
public class TestRunner {

}
