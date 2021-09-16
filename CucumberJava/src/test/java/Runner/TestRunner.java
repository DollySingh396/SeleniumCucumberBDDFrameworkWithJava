package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature", glue={"StepDefinitions"},
//monochrome = true 
plugin = {"pretty", "json:target/JSONReports/report1.json",
		"pretty", "html:target/HTMLReports/report1.html",
		"pretty", "junit:target/JUnitReports/report.xml"}
//tags="@demo"
)
public class TestRunner {
	
}

