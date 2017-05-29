package com.example.demo;

import cucumber.api.junit.Cucumber;
import cucumber.runtime.junit.FeatureRunner;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * This class is a wrapper around Cucumber.java to only run cucumber tests if a certain flag is set.
 */
public class CucumberNotUnitTestRunner extends Cucumber {

	private static final Logger log = LoggerFactory.getLogger(CucumberNotUnitTestRunner.class);

	public static boolean run = true;

	public CucumberNotUnitTestRunner(Class clazz) throws InitializationError, IOException {
		super(clazz);
		String value = System.getProperty("cucumber");
		run = Boolean.valueOf(value);
	}

	@Override
	public List<FeatureRunner> getChildren() {
		if (run) {
			return super.getChildren();
		} else {
			return new LinkedList<>();
		}
	}

	@Override
	protected Description describeChild(FeatureRunner child) {
		if (run) {
			return super.describeChild(child);
		} else {
			return null;
		}
	}

	@Override
	protected void runChild(FeatureRunner child, RunNotifier notifier) {
		if (run) {
			String featureName = child.getName();
			log.info("Running feature: " + featureName);
			super.runChild(child, notifier);
		}
	}

	@Override
	public void run(RunNotifier notifier) {
		if (run) {
			super.run(notifier);
		}
	}
}
