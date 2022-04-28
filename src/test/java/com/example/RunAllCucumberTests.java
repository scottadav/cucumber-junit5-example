package com.example;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Use junit-platform-suite to tell both your IDE and Gradle where to find tests. The "features" folder in
 * src/test/resources contains all .feature files of this project. Note that the SelectClasspathResource annotation
 * can be repeated, thus allowing us to specify multiple locations for feature files.
 *
 * The "cucumber" engine inclusion is not strictly necessary since that is the only engine available in this project.
 * However, if you are planning on running regular JUnit5 tests in the same project, make sure to specify the engine
 * here.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "pretty,summary,html:build/cucumber-result/result.html,json:build/cucumber-result/result.json")
@ConfigurationParameter(key = Constants.PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "true")
public class RunAllCucumberTests {
}
