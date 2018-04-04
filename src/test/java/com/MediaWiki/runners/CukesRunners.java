package com.MediaWiki.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class CukesRunners {
	@CucumberOptions(plugin = { "pretty",
			"html:target/cucumber-report"
			},
			
<<<<<<< HEAD
			tags = "@uplad_file",
=======
			tags = "@printable",
>>>>>>> branch 'master' of https://github.com/danazhanbekova/MediaWikiCrazyHackers.git
			features = "src/test/resources/com/MediaWiki/features/",
			glue = "com/MediaWiki/step_definitions/",
			dryRun = false)
	public class CukesRunner extends AbstractTestNGCucumberTests {

	}

}
