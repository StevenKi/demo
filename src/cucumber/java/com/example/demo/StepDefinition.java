package com.example.demo;

import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;

public class StepDefinition {

    @Given("^I am logged in as \"([^\"]*)\"$")
    public void iAmLoggedInAs(String name) throws Throwable {
        assertEquals("admin", name);
    }

}
