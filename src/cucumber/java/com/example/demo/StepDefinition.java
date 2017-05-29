package com.example.demo;

import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StepDefinition {

    @Given("^I am logged in as \"([^\"]*)\"$")
    public void iAmLoggedInAs(String name) throws Throwable {
        assertEquals("admin", name);
    }

    @Given("^I am here$")
    public void iAmHere() throws Throwable {
        assertTrue(true);
    }
}
