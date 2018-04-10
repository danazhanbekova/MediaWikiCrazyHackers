package com.MediaWiki.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class UploadPageRunner {
	@CucumberOptions(plugin = { "pretty",
			"html:target/cucumber-report" }, 
			tags = "@test", 
			features = "src/test/resources/com/MediaWiki/features/", 
			glue = "com/MediaWiki/step_definitions/", dryRun = false)
	public class CukesRunner extends AbstractTestNGCucumberTests {

	}

}
