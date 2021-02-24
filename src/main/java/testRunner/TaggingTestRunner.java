package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F://eclipseWorkSpace//CucumberFramework//Features//Tagging.feature",
		glue="stepDefinations",
		dryRun=false,
		format={"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml_output/cucumber.xml"},
		monochrome=true,
		strict = false,
		/*tags={"@SmokeTest}
		tags={"@SmokeTest, @RegressionTest"}, //this will execute all the test case which has any of the tags
		tags={"@SmokeTest", "@End2End"} //this will execute only the test case which has both the tags
		*/
		tags={"~@End2End"} //This will ignore the test case with the tag
		)
public class TaggingTestRunner {

}
