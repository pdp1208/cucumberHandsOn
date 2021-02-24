package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="stepDefinations",
		dryRun=false,
		format={"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml_output/cucumber.xml"},
		monochrome=true,
		strict = false
		)
public class MyAccountLoginTestRunner {

}

