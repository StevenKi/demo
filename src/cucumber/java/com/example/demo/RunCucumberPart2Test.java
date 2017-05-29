package com.example.demo;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberNotUnitTestRunner.class)
@CucumberOptions(features = "src/cucumber/features/part2", plugin = {"pretty"})
public class RunCucumberPart2Test {
}
