package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
  features="..\\RhipeProject\\Features",
	glue= "StepDefinition",
	//dryRun=true,
	monochrome=true,
	plugin={"pretty", "html:Test-output", "json:json_output/cucumber.json", "junit:junit_xmloutput/cucumber.xml"},
	strict=false
	
	)
public class Runner {

}
