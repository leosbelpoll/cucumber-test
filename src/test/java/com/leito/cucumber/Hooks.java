package com.leito.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void init() {
        // do some work before test scenarios
        System.out.println("Before hook invoked");
    }

    @After
    public void cleanuo() {
        // do some work after test scenarios
        System.out.println("After hook invoked");
    }

}
